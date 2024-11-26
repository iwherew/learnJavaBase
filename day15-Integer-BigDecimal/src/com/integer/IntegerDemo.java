package com.integer;
/*
    包装类 :将基本数据类型，包装成类，变成引用数据类型

    手动装箱:调用方法，手动将基本数据类型，包装成类
        1.public Integer(int valve):通过构造方法（已过时, 不推荐）
        2.public static Integer valueOf(int i): 通过静态方法
    手动拆箱:调用方法，手动将包装类，拆成(转换)基本数据类型
        1.public int intValue():以 int 类型返回该 Integer 的值

JDK5版本开始，出现了自动拆装箱
    1.自动装箱:可以将基本数据类型，直接赋值给包装类的变量
    2.自动拆箱:可以将包装类的数据，直接赋值给基本数据类型变量
    结论:基本数据类型，和对应的包装类，可以直接做运算了，不需要操心转换的问题了

    public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }

    如果装箱的数据，不在-128~127 之间，会重新创建新的对象
    如果装箱的数据，在 -128 ~ 127 之间，不会创建新的对象，而是从底层的数组中，取出一个提前创建好的Integer对象，返回
    Integer类中，底层存在一个长度为256个大小的数组，Integer[]cache
    在数组中，存储了256个Integer对象，分别是-128~127
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int num = 10;

        // 手动装箱
        Integer i1 = Integer.valueOf(num);
        System.out.println(i1);

        // 手动拆箱
        int i2 = i1.intValue();
        System.out.println(i2);

        // 自动装箱
        Integer i3 = num;

        // 自动拆箱
        int i4 = i3;
    }
}
