package day09extendsandequals.codepractice;
/**
 * 学生测试类
 * */
public class Student1Test {
    public static void main(String[] args) {
        Student stu1 = new Student("尼玛", "13888888888888");
        Student stu2 = new Student("尼玛", "13888888888888");
        System.out.println(stu1);// println 就是调用obj里面的toString方法
        System.out.println(stu2);
        System.out.println("===========================");
       // System.out.println(stu1.toString());
        // euqals值返回为true 但是哈希值不相等！！！
        System.out.println(stu1.hashCode()); //1639705018
        System.out.println(stu2.hashCode());//1627674070
        System.out.println("============================");
        // 哈希值相同 返回结果为true
        Student stu3 = stu1 ;
        System.out.println(stu3.hashCode());// 哈希值与1相同
        System.out.println(stu1.equals(stu3));// 返回结果为true


    }




}
