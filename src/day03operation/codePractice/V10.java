package day03operation.codePractice;
/*
 * 比较运算：最终的结果是boolean --  true   false
 * 		结果：1.可以直接打印
 *          2.定义一个变量接收
 * 	>   <   ==(完全相等)   >=  <= !=(不等于)
 * instanceof 用于引用数据类型的判断（了解）
 * 		判断一个对象是否是某个类的实例
 *
 */

public class V10 {
    public static void main(String[] args) {
        int num = 10;
        int num1 = 20;
        System.out.println(num < num1); //true
        System.out.println(num > num1); //false
        System.out.println(num == num1);//false
        System.out.println(num >= num1);//false
        System.out.println(num <= num1);//true
        System.out.println(num != num1);//true
    }
}
