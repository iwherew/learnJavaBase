package com.constructor;

/*
    构造方法(构造器)
        创建对象的时候，要执行的方法
    格式:
        1.方法名与类名相同，大小写也需要一致
        2.没有返回值类型，连void都没有
        3.没有具体的返回值(不能由return语句带回结果数据)

    构造方法的执行时机:
        在创建对象的时候，被调用执行
        每创建一次对象，就会执行一次构造方法，
    构造方法的作用
        1.本质的作用:创建对象
        2.结合执行时机:可以创建对象的时候，给对象中的数据初始化
    构造方法的注意事项
        1.一个类中，没有编写构造方法，系统将会提供一个【默认的]【无参数]的构造方法
        2.一个类中，如果手动编写了构造方法，系统将不会再提供那个默认的无参构造了
 */

public class Student {
    String name;
    int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
