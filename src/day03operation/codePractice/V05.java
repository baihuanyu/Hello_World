package day03operation.codePractice;

/*数据类型的转化：
 * 1.小转大
 * 		会自动转化
 * 2.大转小
 * 		需要强制转化
 *    	把一个比较大的数据类型 赋值给一个小的数据类型
 * 	 语法： 数据类型  变量名 = （数据类型）值；
 * 	注意：有可能会有精度损失[可能不是你所期望的值]
 *
 */
public class V05 {
    public static void main(String[] args) {
        byte b = 127;
        int i = 127;
        int i1= 130;
        short s = 32767;
        long l = 10l;
        // 小转大不会报错 ，大转小需强制转换（不看数值 看类型）
        byte b1 = (byte) i1;
        System.out.println(b1); // 1000 0100
    }
}
