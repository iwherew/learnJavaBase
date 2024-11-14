package com.mextends;

public class ExtendsDemo3 {
    /*
        方法重载(Overload): 在同一个类中，方法名相同，参数不同，与返回值无关
                            参数不同:类型不同，个数不同，顺序不同
        方法重写(Override):在子父类当中，出现了方法声明一模一样的方法(方法名，参数，返回值)
        使用@Override进行校验是否是重写

        注意：1.父类中私有方法不能被重写
             2.子类重写父类方法时，访问权限必须大于等于父类
     */
    public static void main(String[] args) {
        Son son = new Son();
        son.method();
    }
}

class Father {
    public void method(){
        System.out.println("father method");
    }
}

class Son extends Father {
    @Override
    public void method(){
        super.method(); // 可选择保留父类方法
        System.out.println("son method");
    }
}