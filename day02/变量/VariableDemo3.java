package day02.变量;

public class VariableDemo3 {
    public static void main(String[] args) {
        // 整数和小数取值范围大小关系：
        // double > float > long > int > short > byte

        // byte (-127 ~ 128)
        byte b = 10;
        System.out.println(b);

        // short
        short s = 20;
        System.out.println(s);

        // int
        int i = 30;
        System.out.println(i);

        // long
        // 如果要定义long类型的变量，在数据值后面需要加一个L作为后缀
        // L可以是大写，也可以是小写
        // 推荐使用大写L更明显
        long l = 9999999999L;
        System.out.println(l);

        // float
        // 如果要定义float类型的变量，在数据值后面需要加一个F作为后缀
        float f = 10.1F;
        System.out.println(f);

        // double
        double d = 20.2;
        System.out.println(d);

        // char
        char c = '中';
        System.out.println(c);

        // boolean
        // true false
        boolean o = true;
        System.out.println(o);
    }
}
