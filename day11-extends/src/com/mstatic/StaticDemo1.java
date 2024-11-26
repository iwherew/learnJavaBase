package com.mstatic;
/*
static 关键字 :修饰符，可以修饰成员变量，成员方法
    特点:
    1.被类的所有对象所共享
    2.多了一种调用方式，可以通过类名进行调用（推荐使用类名调用）
    3.随着类的加载而加载，优先于对象存在
 */

public class StaticDemo1 {

    public static void main(String[] args) {
        Student.school = "xx"; // 被类的所有对象所共享
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("李四",24);
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(Student.school); // 可以通过类名进行调用

    }
}
