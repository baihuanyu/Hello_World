package day12usualclass.数学相关的类;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimalor(比double的精度高，一般用在金融项目中)BigInteger(比整数的精度高)
 * 构造方法：
 *       BigDecimal(String val)  （字符串创建，保证精度）
 *                       将BigDecimal的字符串表示 BigDecimal转换为 BigDecimal 。
 *普通方法：
 *       BigDecimal	   add(BigDecimal augend) （加法）
 *                     返回 BigDecimal ，其值是 (this + augend) ，其标为 max(this.scale(), augend.scale()) 。
 *       BigDecimal	   divide(BigDecimal divisor, int roundingMode) （除法）
 *                     返回 BigDecimal ，其值是 (this / divisor) ，其标为 this.scale() 。
 *       BigDecimal	   multiply(BigDecimal multiplicand) （乘法）
 *                     返回 BigDecimal ，其值是 (this × multiplicand)，其标为 (this.scale() + multiplicand.scale()) 。
 *       BigDecimal	   subtract(BigDecimal subtrahend) （减法）
 *                     返回 BigDecimal ，其值是 (this - subtrahend) ，其标为 max(this.scale(), subtrahend.scale()) 。
 *                      * 当精度超出BigDecimal表示范围的时候，就需要用divide方法重载方法
 * 		 *
 * 		 * public BigDecimal divide(BigDecimal divisor,RoundingMode roundingMode)
 * 		 * 该方法现在没有能够设置小数位数的参数，如果需要设置指定小数位数，用重载方法
 * 		 * 	RoundingMode：就是一个枚举类，是决定取舍方式的。
 * 		 * 		使用方式：枚举名.字段；
 *
 *
 * */
public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("3.14");
        BigDecimal b2 = new BigDecimal("2.14");
        /**加*/
        System.out.println(b1.add(b2));
        /**减*/
        System.out.println(b1.subtract(b2));
        /**乘*/
        System.out.println(b1.multiply(b2));
        /**除*/
        //Exception in thread "main" java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.

        //超过了能够容纳的精度 使用roundingmode
        System.out.println(b1.divide(b2, RoundingMode.CEILING));
    }
}
