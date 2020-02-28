package day22java8.lambda;
/**
 * lambda 调用 构造方法
 *
 * */
public class Constuactor {
    public static void main(String[] args) {
        // lambda 表达式 第一种写法
        PersonInterface p = (name,age)-> new Person(name,age);
        System.out.println(p.getInstance("钱多多",18));
        //lam表达式第二种简写方式 自动匹配
//        构造方法的形参列表 必须和函数式接口里面的是抽象方法的形参列表一致（类型，顺序，长度）
        PersonInterface p1 = Person::new;
        Person instance = p1.getInstance("猫咪", 2);
        System.out.println(instance);


    }
}
/**
 * 制定一个人的接口
 * */
interface PersonInterface {
    /** 获取人的姓名和年龄的一个方法*/
    Person getInstance(String name , int age);
}
/**
 * 封装一个学生类
 * */
class Person{
    private  String name;
    private  int  age ;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}