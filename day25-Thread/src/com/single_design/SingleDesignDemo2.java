package com.single_design;
/*
    单例设计模式 - 懒汉式
 */
public class SingleDesignDemo2 {
    public static void main(String[] args) {
        Single2 s1 = Single2.getInstance();
        Single2 s2 = Single2.getInstance();

        System.out.println(s1 == s2);
    }
}

class Single2{
    private Single2(){}

    private static Single2 instance;

    public static Single2 getInstance(){
        if(instance == null){
            synchronized (Single2.class) {
                if(instance == null){
                    instance = new Single2();
                }
            }
        }
        return instance;
    }
}