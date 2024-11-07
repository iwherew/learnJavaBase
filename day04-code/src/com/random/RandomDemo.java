package com.random;

import java.util.Random;


/*
    random.nextInt(100)： 0 - 99
 */

public class RandomDemo {
    public static void main(String[] args) {
        random();
    }

    public static void random() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
    }
}
