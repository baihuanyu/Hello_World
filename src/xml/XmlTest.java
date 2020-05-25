package xml;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.SAXWriter;
import org.dom4j.io.XMLWriter;

import javax.sql.rowset.spi.XmlWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.List;

/**
 * xml操作相关
 *
 * @author shirokansakai*/
public class XmlTest {
    public static void main(String[] args) throws Exception {
        File file = new File("src/xml/contacts.xml");
        // 获取document对象
        SAXReader reader = new SAXReader();
        Document dom = reader.read(file);
        //获取根目录
        Element root = dom.getRootElement();
        //获取元素linkman
        List<Element> list = root.elements("linkman");
        //获取第一个linkman
        Element linkman = list.get(0);
        List elements = linkman.elements();
        Element name = DocumentHelper.createElement("name");
        name.setText("我是刚创建的");
        elements.add(0,name);

        //获取里面的email标签
        Element email = linkman.element("email");
        //获取标签里面的内容
        String text = email.getText();
        System.out.println(text);
        //设置标签里面的值 无返回值
        email.setText("522858867@qq.com");
        /*
         *Writer w = new FileWriter(file);
		  	 // Pretty print the document to System.out
        OutputFormat format = OutputFormat.createPrettyPrint();
        writer = new XMLWriter( System.out, format );
        writer.write( document );

         * */

        //添加一个linkman
        Element addlink = root.addElement("linkman");
        //增加联系人属性
        addlink.addAttribute("id","5");
        //增加联系人的信息
        addlink.addElement("name").addText("宫本武藏");
        addlink.addElement("email").addText("1234567@qq.com");
        addlink.addElement("address").addText("天府三街腾讯大厦A座");
        addlink.addElement("group").addText("王者荣耀");
        /*
        * 删除指定的元素
        *  通过父级去删除子级
        *
        * */



        //获取文件写入流
        Writer w = new FileWriter(file);

        //调用xml的writer写入,使用格式
        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter writer = new XMLWriter(w,format);
        writer.write(dom);
        writer.close();

    }
}
