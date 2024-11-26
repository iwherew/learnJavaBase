package com.single_design;
/*
    单例设计模式 - 饿汉式
 */
public class SingleDesignDemo1 {
    public static void main(String[] args) {
        Single1 s1 = Single1.getInstance();
        Single1 s2 = Single1.getInstance();

        System.out.println(s1 == s2);
    }
}

class Single1{
    private Single1(){}

    private static Single1 instance = new Single1();

    public static Single1 getInstance(){
        return instance;
    }

}
