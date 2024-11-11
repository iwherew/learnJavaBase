package com.mthis;

/*
使用this关键字进行区分
    this可以区分局部变量和成员变量的重名问题
this关键字的作用:
    this可以调用本类成员(变量，方法)
    this.本类成员变量
    方法中没有出现重名的变量，this.才可以省略
 */

public class Student {
    String name;

    public void sayHello(String name){
        System.out.println(name); // 就近使用入参（局部变量）
        System.out.println(this.name); // this使用成员变量
    }
}
