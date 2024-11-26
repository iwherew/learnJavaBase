package com.string;

public class StringMethodDemo2 {
    public static void main(String[] args) {
        print1();
        print2();
    }
    private static void print1(){
        String s = "amadeus";
        // 字符串转字符数组
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
    private static void print2(){
        String s = "amadeus";
        for (int i = 0; i < s.length(); i++) {
            // 获取指定位置的字符
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}
