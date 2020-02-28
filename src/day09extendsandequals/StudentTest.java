package day09extendsandequals;
/**
 * 学生的测试类
 * */
public class StudentTest {
    public static void main(String[] args) {
        // 多态调用。 stu编译的时候调用Person，运行的时候调用student
        Person stu = new Student(23,"周星星","9527");

        stu.show();//show方法里面有super的继承
        stu.study();// study是单独列出来的  无super的继承

    }

}
