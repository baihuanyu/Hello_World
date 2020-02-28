package day02;
// 课后小练习

public class Test_02 {
   static int age;
   static String name;
   static String sex;
   static String a;
   static String b;

    public static void main(String[] args) {
        age = 18;
        name = "哇哈哈";
        sex = "male";
        System.out.print("姓名："+name+"    ");
        System.out.print("年龄："+age+"     ");
        System.out.println("性别:"+sex);
        System.out.println("------------------------------");
        a = "cba";
        b = "nba";
        String c ;// 接收中间量
        c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);
    }

}
