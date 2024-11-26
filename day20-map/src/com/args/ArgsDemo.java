package com.args;
/*
    可变参数
        可变参数用在形参中可以接收多个数据。
        可变参数的格式:数据类型... 参数名称

        传输参数非常灵活，方便，可以不传输参数，可以传输1个或者多个，也可以传输一个数组
        可变参数在方法内部本质上就是一个数组

        注意事项:
        1.一个形参列表中可变参数只能有一个
        2.可变参数必须放在形参列表的最后面
 */
public class ArgsDemo {
    public static void main(String[] args) {
        getSum(1, 2);
        getSum(1, 2, 3);
        getSum(1, 2, 3, 4);
    }

    public static void getSum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}
