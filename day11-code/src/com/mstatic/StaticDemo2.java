package com.mstatic;

public class StaticDemo2 {
    static int num1 = 10;

    int num2 = 20;

    public static void method(){
        System.out.println("static method");
    }

    public void print(){
        System.out.println("print");
    }

    public static void main(String[] args) {
        System.out.println(num1);
        method();

        // 非静态无法访问
//        System.out.println(num2);
//        print();

        // 需要先创建对象才能访问
        StaticDemo2 sd =  new StaticDemo2();
        System.out.println(sd.num2);
        sd.print();
    }
}
