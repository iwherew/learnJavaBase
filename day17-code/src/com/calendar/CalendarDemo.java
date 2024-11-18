package com.calendar;

import java.util.Calendar;

// jdk7使用，不推荐
// 推荐使用LocalDateTime
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR)); // 2024
        System.out.println(c.get(Calendar.MONTH)); // 10【是十一月】 【范围0 - 11】 用的时候记得+1
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); // 18
        System.out.println(c.get(Calendar.HOUR_OF_DAY)); // 13
        System.out.println(c.get(Calendar.MINUTE)); // 54
        System.out.println(c.get(Calendar.SECOND)); // 1
        System.out.println(c.get(Calendar.MILLISECOND)); // 981

        // 日 一 二 三 四 五 六
        // 1  2 3  4  5 6  7
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); // 2【其实是星期一】
        // 解决方案：提前设计一个数组
        char[] weeks = {' ','日','一','二','三','四','五','六'};
        System.out.println(weeks[c.get(Calendar.DAY_OF_WEEK)]); // 一

        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 3
    }
}
