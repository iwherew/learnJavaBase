package com.localDateTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// between(param1, param2) : param2 - param1

public class ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime birthDate = LocalDateTime.of(2000,1,1,0,0,0);

        System.out.println(ChronoUnit.YEARS.between(birthDate, now)); // 24
        System.out.println(ChronoUnit.MONTHS.between(birthDate, now)); // 298
        System.out.println(ChronoUnit.DAYS.between(birthDate, now));
        System.out.println(ChronoUnit.HOURS.between(birthDate, now));
        System.out.println(ChronoUnit.MINUTES.between(birthDate, now));
        System.out.println(ChronoUnit.SECONDS.between(birthDate, now));
        System.out.println(ChronoUnit.MILLIS.between(birthDate, now));
        System.out.println(ChronoUnit.MICROS.between(birthDate, now));
        System.out.println(ChronoUnit.NANOS.between(birthDate, now));
    }
}
