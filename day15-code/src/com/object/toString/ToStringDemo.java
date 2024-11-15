package com.object.toString;

/*
    public String toString() 返回该对象的字符串表示
    细节:使用打印语句，打印对象名的时候，println方法，源码层面，会自动调用该对象的toString方法.
 */
public class ToStringDemo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        System.out.println(a.toString());
    }
}

class A {
    String name = "amadeus";

    @Override
    public String toString() {
        return "name: " + name;
    }
}
