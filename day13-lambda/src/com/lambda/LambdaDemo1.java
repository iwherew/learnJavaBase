package com.lambda;

import java.util.Random;

/*
Lambda表达式 :JDK8开始后的一种新语法形式
    作用: 简化匿名内部类的代码写法。
    格式: () -> {}
         ():匿名内部类被重写方法的形参列表
         {}:被重写方法的方法体代码
    注意事项：Lambda表达式，只允许操作函数式编程接口:有且仅有一个抽象方法的接口

    Lambda表达式的省略写法
        - 参数类型可以省略不写，
        - 如果只有一个参数，参数类型可以省略，同时()也可以省略
        - 如果Lambda表达式的方法体代码只有一行代码
            可以省略大括号不写,同时要省略分号
            此时，如果这行代码是return语句，必须省略return不写，同时也必须省略";”不写

    Lambda表达式和匿名内部类的区别
        使用限制不同
            匿名内部类 :可以操作类，接口
            Lambda表达式 :只能操作函数式接口
        实现原理不同
            匿名内部类:编译之后，产生一个单独的.class字节码文件
            Lambda表达式:编译之后，没有一个单独的.class字节码文件
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        useInterA(()->{
            System.out.println("lambda");
        });

        // 如果只有一个参数，参数类型可以省略，同时()也可以省略
        useInterB(msg -> System.out.println("lambda: "+ msg));

        // 如果这行代码是return语句，必须省略return不写，同时也必须省略";”不写
        useInterC(() -> new Random().nextInt(100) + 1);
    }
    public static void useInterA(InterA a){
        a.show();
    }

    public static void useInterB(InterB b){
        b.print("hello");
    }

    public static void useInterC(InterC c){
       int result = c.getNumber();
       System.out.println(result);
    }

}

// 函数式编程接口校验
@FunctionalInterface
interface InterA{
    void show();
}

// 函数式编程接口校验
@FunctionalInterface
interface InterB{
    void print(String str);
}

// 函数式编程接口校验
@FunctionalInterface
interface InterC{
    int getNumber();
}

