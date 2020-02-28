package day16collection.homework;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *   3、设计一个教师类，具有字段：姓名，年龄，身高字段，然后创建多个教师对象保存到TreeSet中去；
 *   请使用自然排序和定制排序（比较器）分别实现如下效果：
 *   先按照年龄升序，如果年龄相等则按照身高降序
 * 用匿名内部类的方式实现Model类（按照三围（胸围、腰围、臀围）升序）测试类，
 * 每个TreeSet对象添加的元素不少于5个；定制排序 胸围降序、腰围升序
 *
 * */
public class Demo {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        //创建数据
        Teacher t1 = new Teacher("小赵", 23, 175);
        Teacher t2 = new Teacher("小钱", 25, 168);
        Teacher t3 = new Teacher("小孙", 24, 158);
        Teacher t4 = new Teacher("小李", 23, 179);
        Teacher t5 = new Teacher("小周", 24, 181);
        Teacher t6 = new Teacher("小武", 26, 170);
        //将数据放入树集合
        treeSet.add(t1);
        treeSet.add(t2);
        treeSet.add(t3);
        treeSet.add(t4);
        treeSet.add(t5);
        treeSet.add(t6);
        //迭代器遍历
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //foreach 遍历
        System.out.println("==========第二===========");
        for (Object o:treeSet) {
            System.out.println(o);
        }
    }

}
/**
 * 用于储存教师数据的类
 * 实现方式1 接口
 * */
class Teacher implements Comparable<Teacher>{
    private String name;
    private int age;
    private double height;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    /**toString重写*/
    @Override
    public String toString() {
        return name+"老师"+"年龄"+age+"身高"+height+"cm";
    }

    /**
     * 比较规则的重写
     * */
    @Override
    public int compareTo(Teacher o) {
        //判断条件先按照年龄升序，如果年龄相等则按照身高降序
        if (this.age>o.age){
            return 1;
        }else if (this.age<o.age){
            return -1;
        }else {
            if (this.height>o.height){
                return -1;
            }else if (this.height<o.height){
                return 1;
            }else {
                return 0;
            }
        }
    }
}