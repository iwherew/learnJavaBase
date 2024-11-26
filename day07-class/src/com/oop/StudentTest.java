package com.oop;

/*
创建Student类的对象进行使用
1.创建对象的格式
    类名 对象名 = new 类名();
2.使用对象成员变量的格式
    对象名.成员变量;
3.使用对象成员方法的格式
    对象名.成员方法();
 */

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "amadeus";
        stu1.age = 18;
        System.out.println(stu1.name);
        stu1.study();
    }
}
