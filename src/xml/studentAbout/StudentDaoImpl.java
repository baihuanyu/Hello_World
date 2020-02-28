package xml.studentAbout;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.SAXWriter;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.List;
import java.util.Scanner;

/**
 * 进行数据操作的类
 *
 *
 * @author shirokansakai*/
public class StudentDaoImpl {
    public Student student ;
    /** 获取文件*/
    File file = new File("src/xml/studentAbout/Student.xml");
    /** 获取dom对象*/
    Document dom;

    {
        try {
            dom = new SAXReader().read(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**获取根节点*/
    Element root = dom.getRootElement();

    /**
     * 添加数据
     * */
    public void addStu(Student stu) throws Exception {

        //遍历根节点
        List<Element> lists = root.elements("student");
        if (lists.size() == 0){
            //添加子元素
            Element student = root.addElement("student");
            //为新添加的元素设置属性
            student.addAttribute("ID", stu.getId());
            student.addElement("name").setText(stu.getName());
            student.addElement("age").setText(String.valueOf(stu.getAge()));
            //获取文件写入流
            Writer w = new FileWriter(file);
            //调用xml的writer写入,使用格式
            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter writer = new XMLWriter(w,format);
            writer.write(dom);
            writer.close();
            System.out.println("添加成功");
        }else {
            for (Element list : lists) {
                //获取节点的ID属性
                Attribute id = list.attribute("ID");
                if (id.getValue().equals(stu.getId())){
                    System.out.println("ID已经存在，添加失败");
                }else{
                    //添加子元素
                    Element student = root.addElement("student");
                    //为新添加的元素设置属性
                    student.addAttribute("ID", stu.getId());
                    student.addElement("name").setText(stu.getName());
                    student.addElement("age").setText(String.valueOf(stu.getAge()));
                    //获取文件写入流
                    Writer w = new FileWriter(file);
                    //调用xml的writer写入,使用格式
                    OutputFormat format = OutputFormat.createPrettyPrint();
                    XMLWriter writer = new XMLWriter(w,format);
                    writer.write(dom);
                    writer.close();
                    System.out.println("添加成功");
                }
            }
        }
    }
    /**
     * 通过Id值删除信息
     * */
    public void removeStu(String id) throws  Exception{
        //获取子节点
        List<Element> list = root.elements("student");
        //判断是否为空
        if (list.size() == 0){
            System.out.println("这里什么都没有！不需要在删啦");
        }else{
            for (Element element : list) {
                //获取属性id的值
                Attribute id1 = element.attribute("ID");
                if (id1.getValue().equals(id)){
                    element.getParent().remove(element);
                    //获取文件写入流
                    Writer w = new FileWriter(file);
                    //调用xml的writer写入,使用格式
                    OutputFormat format = OutputFormat.createPrettyPrint();
                    XMLWriter writer = new XMLWriter(w,format);
                    writer.write(dom);
                    writer.close();
                    System.out.println("删除成功！！");
                    return;
                }
            }
            System.out.println("ID匹配不成功，无法删除");

        }
    }
    public void setStu(String id ,String name ,Integer age) throws Exception {
        List<Element> list = root.elements("student");
        //如果里面没有元素
        if (list.size() == 0){
            // 将传入的值进行添加
            Student student = new Student(id, name, age);
            addStu(student);
            System.out.println("已帮你添加该学生的信息");
        }else{
            for (Element element : list) {
                Attribute id1 = element.attribute("ID");
                if (id1.getValue().equals(id)){
                    element.addElement("name").setText(name);
                    element.addElement("age").setText(String.valueOf(age));
                    FileWriter w = new FileWriter(file);
                    OutputFormat format = OutputFormat.createPrettyPrint();
                    XMLWriter writer = new XMLWriter(w,format);
                    writer.write(dom);
                    writer.close();
                    return;
                }
            }
            System.out.println("无法匹配该ID");
        }

    }
    /**
      通过id查询学生信息
     */
    public void checkStu(String id){
        List<Element> list = root.elements("student");
        if (list.size() == 0) {
            System.out.println("这里空空如也！");
        }else{
            for (Element element : list) {
                Attribute id1 = element.attribute("ID");
                if (id1.getValue().equals(id)){
                    //获取对应的信息
                    String id2 = element.element("id").getText();
                    String name = element.element("name").getText();
                    String age = element.element("age").getText();
                    System.out.println(id2+"  "+name+" "+age);
                    return;

                }
            }
            System.out.println("无法匹配该ID");
        }
    }
}


