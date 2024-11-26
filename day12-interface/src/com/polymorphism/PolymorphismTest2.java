package com.polymorphism;

/*
    多态的成员访问特点:
        1.成员变量 :编译看左边(父类)，运行看左边(父类)
        2.成员方法 :编译看左边(父类)，运行看右边(子类)
            在编译的时候，会检查父类中有没有这个方法
                没有:编译出错
                有:编译通过，但是运行的时候，一定会执行子类的方法逻辑
            原因:担心你调用的方法，在父类中是一个抽象方法

    多态创建对象，调用静态成员
        静态的成员，推荐类名进行调用
        细节:静态的成员，可以使用对象名调用，但这是一种假象
            - 生成字节码文件后，会自动将对象名调用，改成类名调用

    多态弊端：不能使用子类的特定成员（使用多态向下转型可解决）
 */

public class PolymorphismTest2 {
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.num); // 10
        f.show();   // zi show
        f.print();   // fu print 生成字节码文件转为 Fu.print();
        // 多态转型，向下转型需要 显式强转
        if(f instanceof Zi){ // instanceof :判断左边的引用，是否是右边的数据类型
            Zi z = (Zi) f;
            z.print(); // zi print
        }
    }
}

class Fu {
    int num = 10;

    public void show(){
        System.out.println("fu show");
    }
    public static void print(){
        System.out.println("fu print");
    }
}

class Zi extends Fu {
    int num = 20;
    public void show(){
        System.out.println("zi show");
    }
    public static void print(){
        System.out.println("zi print");
    }
}
