package day09extendsandequals;
/**
 * 定义一个学生类 继承自人类
 * 进行private封装
 * */


public class Student extends Person {
    /**学号*/
    private String id;
    /**有参无参构造*/
    public Student(){
        super();
    }
    public Student(int age, String name, String id) {
        super(age, name);
        this.id = id;
    }
    //父类方法重写
    @Override
    public void show() {
        super.show();
        System.out.println("学号："+this.id);

    }

    @Override
    public void study() {
        System.out.println("我是学生类里面的学习方法");
    }


}
