package com.localDateTime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// 时间戳
public class InstantDemo1 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now); // 标准时区时间

        ZonedDateTime now2 = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(now2); // 2024-11-18T14:48:56.188223900+08:00[Asia/Shanghai]
    }
}
