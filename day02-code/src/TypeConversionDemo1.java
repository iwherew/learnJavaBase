public class TypeConversionDemo1 {
    /*
        类型转换 - 隐式转换
        介绍：将取值范围小的数据或变量，给取值范围大的变量赋值，可以直接赋值
        简单记：小的给大的，可以直接给

        取值范围从大到小
        byte ->short ->int ->long -> float -> double
            问题:float占用4个字节，为什么放在了long(8个字节)的后面
            解释:虽然float占用4个字节，但是[取值范围]要比8个字节的long 更大
            小数的二进制存储形式，更加节省内存

        取值范围小的数据，和取值范围大的数据进行运算，小的会先提升为大的之后，再进行运算
        int a = 10;
        double b = 12.3;
        double c = a + b;

        byte short char 三种数据在运算的时候，都会提升为int，然后再进行运算

     */
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        // byte short char 三种数据在运算的时候，都会提升为int，然后再进行运算
        // byte c = a + b;
        int c = a + b;
    }
}
