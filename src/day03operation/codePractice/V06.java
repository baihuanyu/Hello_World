package day03operation.codePractice;
/*表达式：有常量  变量  运算符  （） 组成的一个算式
 * 运算符 ：常见的： + - * /
 * 1.直接打印表达式 ，打印表达式的结果
 * 2.定义一个变量接收表达式的结果
 * 		a.表达式的运算结果类型会自动提升，整个表达式结果由表达式中最大的类型决定
 */
public class V06 {
    public static void main(String[] args){
        int i = 1;
        int i1 =2;
        //可以直接打印表达式的结果
        System.out.println(i1+i);
        byte b = 10;
        System.out.println(b+i);//大类型和小类型相加 自动转换为大类型
        //同样也可以用变量去接收表达式的结果
        int i2= b+i1;
        System.out.println(i2);
    }
}
