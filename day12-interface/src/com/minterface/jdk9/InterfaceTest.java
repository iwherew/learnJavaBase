package com.minterface.jdk9;

/*
    JDK9接口特性:
        接口中允许定义私有方法（不想在接口外部调用）
 */

public class InterfaceTest {
    public static void main(String[] args) {
        AInterfaceImpl a = new AInterfaceImpl();
        a.start();
        a.end();
    }
}

interface Inter{
    void show();
    public default void start(){
        System.out.println("start");
        log();
    }
    public default void end(){
        System.out.println("end");
        log();
    }

    private void log(){
        System.out.println("log");
    }
}

class AInterfaceImpl implements Inter{

    @Override
    public void show() {
        System.out.println("show");
    }
}