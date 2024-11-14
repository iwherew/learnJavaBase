package com.mextends.constructor;

public class Test {
    /*
    除了Object类，在所有构造方法的第一行代码，都默认隐藏了一句话 super();
    通过这句代码，访问父类的空参数构造方法
    细节:Java当中所有的类，都直接或者间接的继承到了 Object 类
     */
    public static void main(String[] args) {
        Zi zi = new Zi();
        Zi zi1 = new Zi(10);
    }
}

class Fu{
    public Fu(){
        System.out.println("Fu");
    }

    public Fu(int num){
        System.out.println("Fu with num " + num);
    }
}

class Zi extends Fu{
    public Zi(){
        // super();  // 自动加上
        System.out.println("子类空参");
    }

    public Zi(int num){
        super(num);
        System.out.println("子类带参");
    }
}
