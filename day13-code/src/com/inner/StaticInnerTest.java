package com.inner;
/*
静态内部类:static 修饰的成员内部类
创建对象格式 :外部类名.内部类名 对象名= new 外部类名.内部类对象();
 */
public class StaticInnerTest {
    public static void main(String[] args) {
        OuterClass.InnerClass oi = new OuterClass.InnerClass();
        oi.show();

        OuterClass.InnerClass.show();
    }
}

class OuterClass{
    static class InnerClass{
        public static void show(){
            System.out.println("show");
        }
    }
}