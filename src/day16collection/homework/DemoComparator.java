package day16collection.homework;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 外部类实现定制
 *
 * */
public class DemoComparator {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new T1Comparator());
        //创建数据
        Teacher1 t1 = new Teacher1("小赵", 23, 175);
        Teacher1 t2 = new Teacher1("小钱", 25, 168);
        Teacher1 t3 = new Teacher1("小孙", 24, 158);
        Teacher1 t4 = new Teacher1("小李", 23, 179);
        Teacher1 t5 = new Teacher1("小周", 24, 181);
        Teacher1 t6 = new Teacher1("小武", 26, 170);
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
class Teacher1 {
    public String name;
    public int age;
    public double height;

    public Teacher1(String name) {
        this.name = name;
    }

    public Teacher1(String name, int age, double height) {
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