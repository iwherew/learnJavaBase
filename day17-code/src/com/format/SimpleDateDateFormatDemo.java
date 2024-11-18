package com.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        format();
        parse();
    }

    // 日期字符串解析转为Date
    private static void parse() throws ParseException {
        String today = "2024年11月18日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(today);
        System.out.println(date); // Mon Nov 18 00:00:00 CST 2024
    }

    // 日期格式化
    private static void format() {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        String result = sdf.format(date);
        System.out.println(result); // 2024/11/18 下午1:43

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date2 = new Date();
        String result2 = sdf2.format(date2);
        System.out.println(result2); // 2024-11-18 13:44:14
    }
}
