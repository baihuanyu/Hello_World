package day02;
//课堂作业
/*
* 1 java的基本数据类型有？并使用基本类型加变量表示
* 答： float，double，int ，byte ，short ，long ，String ，Char ， boolean
* 2定义两个年龄 算他们的和
* 三、	声明String类型变量name和int类型变量age，让name表示 良辰，age表示45。
例如：打印输出格式为：姓名：良辰，年龄：45
String name = “良辰”;
int age = 45;
*
*
*
* */
public class Task_1230 {
    public static void main(String[] args) {
        //float需要进行精度标明
        float a = 3.1f;
        System.out.println("浮点型："+a);
        double b = 3.1;
        System.out.println("浮点型2："+b);
        //字节型 范围 -128到127
        byte c = 1;
        System.out.println("字节型:"+c);
        //短整型  范围 -32768到32767
        short d = 2;
        System.out.println("短整型："+d);
        //整型
        int e = 999;
        System.out.println("整型："+e);
        // 长整型 范围很大
        long f = 99999999;
        System.out.println("长整型："+f);
        //字符串类型
        String g = "你好";
        System.out.println("字符串类型："+g);
        //布尔类型 只有true or false
        boolean h = true;
        System.out.println("布尔类型："+h);
        //字符型用于保存单个字符或汉字
        //char采用unicode编码方式（8位的ASCII码包含在其中）
        //字符型占两个字节（也可以赋值0-65535的数字）
        // char 用单引号
        char i = 97;
        System.out.println("字符型："+h+"也可以是单个字符");
        System.out.println("====================课后习题2============================");
        int age1 = 18;
        int age2 = 19;
        int age3 = age1+age2;
        System.out.println(age3);
        System.out.println("====================课后习题3============================");
        String name3 = "良辰";
        String age= "18";
        System.out.println("姓名:"+name3+","+"年龄："+age);

    }
}
