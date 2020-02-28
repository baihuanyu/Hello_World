package day03operation.codePractice;
//浮点类型
/*float:4
 *double:8
 *  1.浮点类型的常量默认类型是double
 *  2.浮点类型的默认值是0.0;
 *  3.特别注意： float 和 double 都不能精确的表示一个小数，只是一个无限接近的数字
 *  	精确的小数用 BigDecimal
 * */

import java.math.BigDecimal;

public class V02 {
    public static void main(String[] args) {
        float f = 5.2f;//float 需添加f 默认double类型浮点数
        double d = 2.5;
        System.out.println(f);
        System.out.println(d);
        //浮点数除浮点数
        System.out.println(1.2/2.4);
        System.out.println(0.5+0.1);//有时候浮点数会出现误差，如果要精确 那么使用Bigdecimal
        Object h = new BigDecimal(0.4);
        System.out.println(h);

    }
}
