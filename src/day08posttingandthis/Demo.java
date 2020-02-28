package day08posttingandthis;
/**
 * 创建一个demo类
 *  用于实验有参构造和无参构造实验
 *
 * */
public class Demo {
    /**姓名*/
    String name;
    /**年龄*/
    int age;
    /**
     * 方法 用于打印信息
     * */
    void show(){
        System.out.println("姓名:"+name+"，年龄："+age);
    }
    /**
     * 无参构造
     * */
    public Demo() {
        System.out.println("我是无参构造");
    }
    /**
     * 有参构造
     * */
    public Demo(String name, int age) {
        this.name = name;// 不使用this 相当于在局部变量中 name给name复制 一直在局部循环 找不到成员变量
        this.age = age;
    }
}
