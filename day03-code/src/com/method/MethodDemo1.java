package com.method;

public class MethodDemo1 {
    /*
        注意事项:
            1.方法与方法之间是平级关系，不允许嵌套定义
            2.方法不调用就不执行
            3.方法的定义顺序，和执行顺序无关，要想梳理执行顺序，就看调用顺序
     */
    public static void main(String[] args) {
        System.out.println("start");
        method1();
        System.out.println("end");
    }

    public static void method1() {
        System.out.println("method1");
        System.out.println("method1-1");
    }
}
