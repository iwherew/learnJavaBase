public class OperatorDemo1 {
    /*
        算数运算符：
            + : 遇到字符串变连接符（从左往右）
            -
            *
            / ： 整数相除，结果只能得到整数，想要得到带有小数的结果，需要有小数参与运算
            % ： 取模：取余数
     */

    public static void main(String[] args) {
        System.out.println(5 / 2);      // 2
        System.out.println(5.0 / 2);    // 2.5
        System.out.println(5 / 2.0);    // 2.5
        System.out.println(5.0 / 2.0);  // 2.5
    }
}
