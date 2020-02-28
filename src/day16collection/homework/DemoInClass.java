package day16collection.homework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoInClass {
    public static void main(String[] args) {
        //使用匿名内部类
        TreeSet treeSet = new TreeSet(new Comparator<Teacher2>() {
            @Override
            public int compare(Teacher2 o1, Teacher2 o2) {
                if (o1.age>o2.age){
                    return -1;
                }else if (o1.age<o2.age){
                    return 1;
                }else {
                    if (o1.height>o2.height){
                        return 1;
                    }else if (o1.height<o2.height){
                        return -1;
                    }else {
                        return 0;
                    }
                }
            }
        });
        //创建数据
        Teacher2 t1 = new Teacher2("小赵", 23, 175);
        Teacher2 t2 = new Teacher2("小钱", 25, 168);
        Teacher2 t3 = new Teacher2("小孙", 24, 158);
        Teacher2 t4 = new Teacher2("小李", 23, 179);
        Teacher2 t5 = new Teacher2("小周", 24, 181);
        Teacher2 t6 = new Teacher2("小武", 26, 170);
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
class Teacher2 {
    public String name;
    public int age;
    public double height;

    public Teacher2(String name) {
        this.name = name;
    }

    public Teacher2(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    /**
     * toString重写
     */
    @Override
    public String toString() {
        return name + "老师" + "年龄" + age + "身高" + height + "cm";
    }

}