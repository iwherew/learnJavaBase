package com.mfinal;
/*
    final :修饰符，可用于修饰方法，类，变量
    特点:
    修饰方法:表明该方法是最终方法，不能被重写
    修饰类:表明该类是最终类，不能被继承
    修饰变量:表明该变量是常量，不能再次被赋值

    基本数据类型:数据值不可改变
    引用数据类型:地址值不可改变，但是内容可以改变

    final修饰成员变量的注意事项
        1.final修饰成员变量，不允许修饰默认值
        2.final修饰成员变量的初始化时机
            1)在定义的时候直接赋值
            2)在构造方法中完成赋值

    final修饰变量的命名规范
    如果变量名是一个单词，所有字母大写 max -> MAX
    如果变量名是多个单词，所有字母大写，中间使用下划线分割 maxValue -> MAX_VALUE
 */

public class FinalDemo {
    public static void main(String[] args) {
        final int num = 1;
//        num = 2;
        System.out.println(num);

        final int[] arr = {11,22,33};
        arr[0] = 55;
//        arr = new int[3];
        System.out.println(arr[0]);
    }
}

class Student {
    final int id = 50;

//    public Student() {
//        id = 10;
//    }
}

final class Fu{
    public final void method(){
        System.out.println("Fu");
    }
}

//class Zi extends Fu{

//    @Override
//    public void method(){
//        System.out.println("Zi");
//    }

//}
