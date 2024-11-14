package com.mabstract;
/*
    抽象类:特殊的父类
        问题:特殊在哪里呢?
        回答:内部允许编写抽象方法

        问题:什么是抽象方法?
        回答: 当我们将共性的方法，抽取到父类之后，发现这个方法在父类中无法给出具体明确(描述不清了)
                而且这个方法，还是子类必须要有的方法，就可以设计为抽象方法，

        注意事项:
        1.抽象类不能实例化
        2.抽象类存在构造方法
        3.抽象类中可以存在普通方法
        4.抽象类的子类
            1)要么重写抽象类中的所有抽象方法
            2)要么是抽象类

        冲突：final(不可重写) private（不可重写） static（调用抽象方法无意义）
 */
public class AbstractTest1 {
    public static void main(String[] args) {

    }
}

abstract class Animal{
    public abstract void eat();
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃肉");
    }
}
