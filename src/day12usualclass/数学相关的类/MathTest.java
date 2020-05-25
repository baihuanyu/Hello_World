package day12usualclass.数学相关的类;
/**
 * 常量：
      static double	E
     *                  double值比其他任何一个都更接近 e ，自然对数的基数。
     * static double	PI
     *                  double值比任何其他的更接近 pi ，圆周长与其直径的比率。
 *常用方法（全为静态方法）：
 *     static double	abs(double a)
 *                      返回值为 double绝对值。
 *      static double	ceil(double a)  （近一法）
 *                      返回大于或等于参数的最小（最接近负无穷大） double值，等于一个数学整数。
 *      static double	floor(double a) （舍一法）
 *                      返回小于或等于参数的最大（最接近正无穷大） double值，等于一个数学整数。
 *      static int	    round(float a) （四舍五入 返回的是整数）
 *                      返回参数中最接近的 int ，其中 int四舍五入为正无穷大。
 *      static long	    max(long a, long b)
 *                      返回两个 long的较大值。
 *     static double	min(double a, double b)
 *                      返回两个 double的较小值。
 *     static double	pow(double a, double b) （第二个为指数）
 *                      将第一个参数的值返回到第二个参数的幂。
 *
 * */
public class MathTest {
    public static void main(String[] args) {
        /**d打印常量*/
        System.out.println("pi的值"+Math.PI);
        System.out.println(Math.E);
        /**近一法*/
        System.out.println("进一"+Math.ceil(2.5));//3
        /**绝对值*/
        System.out.println("绝对值"+Math.abs(-2.5));
        /**舍一*/
        System.out.println("舍一"+Math.floor(2.5));//2
        /**四舍五入*/
        System.out.println("四舍五入"+Math.round(-2.5));//3
        /**最大值*/
        System.out.println("最大值"+Math.max(2.1,3.1));
        /**最小值*/
        System.out.println("最小值"+Math.min(1,2));
        /**幂运算*/
        System.out.println("幂运算"+Math.pow(4,3));//指2的三次方
    }
}
