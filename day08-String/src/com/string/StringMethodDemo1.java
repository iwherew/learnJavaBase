package com.string;

public class StringMethodDemo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

        String ss1 = "abc";
        String ss2 = new String("abc");
        System.out.println(ss1.equalsIgnoreCase(ss2)); // true 不考虑大小写

        
    }
}
