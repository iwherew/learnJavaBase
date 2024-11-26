public class VariableDemo2 {

    /*
    * 变量注意事项：
    *   1、变量名不允许重复定义
    *   2、一条语句，可以定义多个变量
    *   3、变量使用之前，必须完成赋值
    *   4、变量的作用域
    * */

    public static void main(String[] args) {
        int salary = 1000;

        // 1、变量名不允许重复定义
        // int salary = 1500;

        // 2、一条语句，可以定义多个变量
        int a = 10, b = 20, c = 30;

        // 3、变量使用之前，必须完成赋值
        int num;
        num = 10;
        System.out.println(num);

    }
}
