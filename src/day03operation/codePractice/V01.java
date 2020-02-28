package day03operation.codePractice;
//byte  [-128,127]
/*byte short int long
 *   1.对于数字类型的常量默认是 int类型
 *   2.对于整型的基本基本数据类型的 默认值  0
 *
 * */

public class V01 {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 2111111111;
        long l = 21231241515135l;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
    }
}
