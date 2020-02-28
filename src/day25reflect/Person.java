package day25reflect;
/**
 * 封装一个人类 用于测试反射的方法
 *
 * @author shirokansakai*/
public class Person {
    /**公有的身高*/
    public double high;
    /**姓名*/
    private int age;
    /**年龄*/
    private String name;

    public Person() {
    }
    /**私有化的构造方法*/
    private Person(String name){
        this.name = name;
    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    /**私有化的方法*/
    private int show(int a , int b){
        return a+b;
    }
}
