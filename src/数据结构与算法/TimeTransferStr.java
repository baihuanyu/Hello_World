package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author baihuanyu bwx966955
 * @date 2020/12/10 14:52
 */
public class TimeTransferStr {

    public static void main(String[] args) throws ParseException {
        int day = LocalDateTime.now().getDayOfYear();
        System.out.println(day);
        LocalDateTime of = LocalDateTime.of(2020, 8, 13, 0, 0);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse("2020-07-20");
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse("2020-07-20 00:00:00", pattern);
        System.out.println(parse);
        System.out.println(date);
        LocalDateTime time = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(time.toLocalDate().toString());
        System.out.println(LocalDateTime.ofInstant(date.toInstant(),  ZoneId.systemDefault()));
        System.out.println(LocalDateTime.ofInstant(date.toInstant(),  ZoneId.systemDefault()).getDayOfYear());
        int day1 = of.getDayOfYear();
        System.out.println(day1);
        System.out.println((day-day1) / 365.0 * 5);
    }
}
