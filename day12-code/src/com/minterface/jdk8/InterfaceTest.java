package com.minterface.jdk8;

/*
    JDK8版本接口特性:
        1.允许定义非抽象方法，需要加入default关键字
            - 作用：解决接口的升级问题（直接在接口写方法，不用在所有实现类里加）
            - 注意事项：
                    1.public 可以省略， default 不可省略
                    2.默认方法，实现类是允许重写的，但是需要去掉default关键字
                    3.如果实现了多个接口，多个接口中存在相同的默认方法，实现类必须重写默认方法
        2.允许定义静态方法
            既然接口已经允许方法带有方法体了，干脆也放开静态方法，可以类名调用
            - 注意事项：
                    1.public 可以省略， static 不可省略
                    2.接口中的静态方法，只允许接口名进行调用，不允许实现类通过对象调用
 */

public class InterfaceTest {
    public static void main(String[] args) {
        AInterImpl a = new AInterImpl();
        a.method();
        Inter.func();
    }
}

interface Inter{
    void show();

    public default void method(){
        System.out.println("interface method");
    }

    public static void func(){
        System.out.println("interface func");
    }
}

class AInterImpl implements Inter{
    // 可重写覆盖
    @Override
    public void method() {
//        super.method();  // 指向Object
        Inter.super.method();
    }

    @Override
    public void show() {
        System.out.println("a show");
    }
}

class BInterImpl implements Inter{

    @Override
    public void show() {
        System.out.println("b show");
    }
}
