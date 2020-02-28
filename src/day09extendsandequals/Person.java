package day09extendsandequals;
/**
 * 定义一个人的父类
 * 进行private封装
 * */
public class Person {
    /**
     * 年龄
     */
    private int age;
    /**
     * 姓名
     */
    private String name;

    /**
     * 无参构造
     */
    public Person() {
    }

    /**
     * 有参构造
     */
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * get set 方法
     */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName() {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;

        } else {
            System.out.println("年龄不合法");
        }
    }

    /**
     * show 方法
     */
    public  void show() {
        System.out.println("个人姓名:" + this.name);
        System.out.println("年龄：" + this.age);
    }
    // 学习的方法：
    public  void  study(){
        System.out.println("我是人类的学习");
    }
}
