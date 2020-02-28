package day22java8.localTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * */
public class LocalTimeTest {
    public static void main(String[] args) {
        //获取当前时间日期
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //获取当前时间
        LocalTime now1 = LocalTime.now();
        System.out.println(now1);
        //获取当前日期
        LocalDate now2 = LocalDate.now();
        System.out.println(now2);
        // 可以获取很多日期，时间 月份，什么的
        Month month = now.getMonth();
        System.out.println(month);
    }
}
