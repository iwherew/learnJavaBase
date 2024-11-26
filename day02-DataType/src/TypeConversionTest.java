public class TypeConversionTest {
    /*
        Java存在常量优化机制 :在编译的时候(javac)就会将3和4这两个字面量进行运算
        产生的字节码文件: byte b=7;
        结果范围 -128~127 byte
     */
    public static void main(String[] args) {
        byte b = 3 + 4;
        System.out.println(b);
        byte c = -99999 + 100000;
        System.out.println(c);
    }
}
