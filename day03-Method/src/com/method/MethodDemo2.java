package com.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        int result = getMax(10, 20);
        System.out.println(result);
    }
    public static int getMax(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}
