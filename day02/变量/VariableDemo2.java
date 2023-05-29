package day02.变量;

public class VariableDemo2 {
    public static void main(String[] args) {
        // 1、基本用法
        // 定义变量，再进行输出
        int a = 10;
        System.out.println(a);

        // 2、变量参与计算
        int b = 10;
        int c = 20;
        System.out.println(b + c);

        // 3、修改变量记录的值
        a = 50;
        System.out.println(a);

        // 注意事项
        // 在一条语句中可以定义多个变量
        int d = 100, e = 200, f = 300;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        // 变量在使用之前必须要赋值
        // java: 可能尚未初始化变量g
        // 建议：变量在初始化的时候赋值
        int g;
//        System.out.println(g);
    }
}
