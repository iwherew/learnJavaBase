package com.bigDecimal;
/*
    BigDecimal类 :解决小数运算中，出现的不精确问题
    创建方式：1. new BigDecimal(String val)
            2. BigDecimal.valueOf(Double val)

    注意:如果使用BigDecimal运算，出现了除不尽的情况，就会出现异常

    BigDecimal常用成员方法
    public BigDecimal add(BigDecimal b):加法
    public BigDecimal subtract(BigDecimal b): 减法
    public BigDecimal multiply(BigDecimal b):乘法
    public BigDecimal divide(BigDecimal b):除法
    public BigDecimal divide(另一个BigDecimal对象，精确几位，舍入模式):除法
 */
import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double num1 = 0.1;
        double num2 = 0.2;
        System.out.println(num1 + num2); // 0.30000000000000004

        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        System.out.println(b1.add(b2)); // 0.3
        BigDecimal b3 = BigDecimal.valueOf(0.1);
        BigDecimal b4 = BigDecimal.valueOf(0.2);
        System.out.println(b3.add(b4)); // 0.3

        BigDecimal b5 = BigDecimal.valueOf(10.0);
        BigDecimal b6 = BigDecimal.valueOf(3.0);
        System.out.println(b5.divide(b6, 2, BigDecimal.ROUND_HALF_UP)); // 3.33 四舍五入
        System.out.println(b5.divide(b6, 2, BigDecimal.ROUND_UP)); // 3.34 进一法
        System.out.println(b5.divide(b6, 2, BigDecimal.ROUND_DOWN)); // 3.33 去尾法

        BigDecimal result = b5.divide(b6, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(Math.abs(result.doubleValue()));
    }
}
