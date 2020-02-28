package day12usualclass.日期相关的类;

import java.util.Calendar;

/**
 *类似单例模式
 *  Calendar 是抽象类 创建对象（多态）子类创建获取实例
 *
 *
 *  static Calendar	  getInstance() 获取实例
 *                     使用默认时区和区域设置获取日历。
 *
 *abstract void	     add(int field（字段）, int amount（添加的 如果超出了就年份加1）)
 *                   根据日历的规则，将指定的时间量添加或减去给定的日历字段
 *
 * */
public class CalendarTest {
    public static void main(String[] args) {
        //获取实例
        Calendar instance = Calendar.getInstance();
        //获取年  用常量获取
        int year = instance.get(Calendar.YEAR);
        //获取月  用常量获取
        int month = instance.get(Calendar.MONTH);
        //获取日  用常量获取
        int ri = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month);
        System.out.println(ri);
    }
}
