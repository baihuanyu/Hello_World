package day12usualclass.日期相关的类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用于调整日期格式的方法
 *构造方法：
 *       SimpleDateFormat()
 *                        构造一个 SimpleDateFormat使用默认模式和日期格式符号为默认的 FORMAT区域设置。
 *       SimpleDateFormat(String pattern（模版）)
 *                        使用给定模式 SimpleDateFormat并使用默认的 FORMAT语言环境的默认日期格式符号。
 *       void	applyPattern(String pattern)
 *                        将给定的模式字符串应用于此日期格式。
 *       String format(Date date)  - 用于将Date类型转换为String类型并返回
 *
 *      Date parse(String source)   - 用于将String类型转换为Date类型并返回
 *
 *
 * */
public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        //创建时间
        Date date = new Date();
        //准备模版 也可以直接使用有参构造
        String pattern = "yyyy年MM月dd日 HH：mm：ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        //应用模版将时间格式化
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        //将字符串转化为日期格式
        Date d2 = simpleDateFormat.parse(format);//需要抛异常
        System.out.println(d2);


    }
}
