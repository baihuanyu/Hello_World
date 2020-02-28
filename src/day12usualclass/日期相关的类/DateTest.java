package day12usualclass.日期相关的类;

import java.util.Date;

/**
 *常用方法
 *     Date() - 无参构造方式   ，默认使用当前系统时间来初始化对象
 *     Date(long date) - 根据参数指定的毫秒来构造对象。
 *         - 参数为距离1970 年 1 月 1 日0时0分0秒的毫秒数， 1秒=1000毫秒  1毫秒=1000微妙
 *         - 该方法与File类中的方法搭配使用很方便。
 *     long getTime()   -  用于获取调用对象距离1970 年 1 月 1 日0时0分0秒的毫秒数
 *     void setTime(long time)   -  根据参数指定的毫秒数来调整对象描述的时间。
 *     before(Date date)判断是否在指定日期之前
 *     after(Date date)判断是否在指定日期之后
 *
 * */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();//现实距离1970年1月1日到现在的毫秒数
        System.out.println(time);
    }
}
