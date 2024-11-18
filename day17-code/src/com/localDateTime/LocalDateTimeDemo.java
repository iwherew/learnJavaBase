package com.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// LocalDateTime 年月日时分秒
// localDate 年月日
// localTime 时分秒

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        // 获取此刻时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // LocalDateTime 转为 localDate localTime
        LocalDate localDate = now.toLocalDate();
        LocalTime localTime = now.toLocalTime();

        // 获取指定时间
        LocalDateTime myTime = LocalDateTime.of(2024, 5, 20,8,8,8);
        System.out.println(myTime);

        System.out.println(now.getYear()); // 2024
        System.out.println(now.getMonth()); // NOVEMBER
        System.out.println(now.getMonthValue()); // 11
        System.out.println(now.getDayOfMonth()); // 18
        System.out.println(now.getHour()); // 14
        System.out.println(now.getMinute()); // 31
        System.out.println(now.getSecond()); // 28
        System.out.println(now.getNano()); // 488972800 纳秒
        System.out.println(now.getDayOfWeek()); // MONDAY
        System.out.println(now.getDayOfYear()); // 323

    }
}
