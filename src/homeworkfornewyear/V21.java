package homeworkfornewyear;

import java.util.Scanner;

public class V21 {
    public static void main(String[] args) {
        System.out.println("请输入整数：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String i1 = Integer.toString(i);//整数转换成字符串类型。
        System.out.println(i1.length());
        Integer i2 = new Integer(i1);//将字符串转换成整数类型。
    }
}
