package day07oop.codePractice;

public class V09Test_ {
    public static void main(String[] args) {
        //3.1. 创建对象（相当于复制模板）: 语法： new 类名();

        V09 student = new V09();//必须声明一个Student类型的变量接收当前对象地址
        //3.2. 对象赋值（填写信息）	语法：	对象名.成员变量 = 值;
        student.name = "苍老师";

        student.age = 37;
        //3.3. 对象取值（相当于查询信息）	语法：	对象名.成员变量;
        System.out.println(student.name);//"苍老师"

        System.out.println(student.age);//37
        //3.4. 对象调用非static方法	语法：	对象名.方法名(...);
        student.study();
    }
}