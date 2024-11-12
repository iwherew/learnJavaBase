package com.stringBuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
