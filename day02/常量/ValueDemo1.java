package day02.常量;

public class ValueDemo1 {
    public static void main(String[] args) {
        // 字面量：整数、小数、字符串、字符、布尔、空

        // 整数
        System.out.println(666);
        System.out.println(-777);

        // 小数
        System.out.println(1.9);
        System.out.println(-3.14);

        // 字符串
        System.out.println("这是字符串");
        System.out.println("amadeus");

        // 字符
        System.out.println('男');
        System.out.println('女');

        // 布尔
        System.out.println(true);
        System.out.println(false);

        // 空值
        // null 不能直接打印
        // java: 对println的引用不明确
        //  java.io.PrintStream 中的方法 println(char[]) 和 java.io.PrintStream 中的方法 println(java.lang.String) 都匹配
//        System.out.println(null);
    }
}
