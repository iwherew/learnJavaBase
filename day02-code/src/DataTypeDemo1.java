public class DataTypeDemo1 {
    /*
        数据类型：
            1、基本数据类型
                整数
                    byte    1个字节    -128 ~ 127
                    short   2个字节
                    int     4个字节    默认（10位数）
                    long    8个字节    （19位数）
                小数
                    float   4个字节
                    double  8个字节    默认
                字符
                    char    2个字节
                布尔
                    boolean 1个字节

            2、引用数据类型

            -----------------------------------------------------

        使用思路：
            1、整数类型： 首选int，如果发现int装不下，将类型换成long，定义long类型变量需要加入L的标识
            2、小数类型： 首先double，非要用float类型，需要加入F标识
     */
    public static void main(String[] args) {

        int a = 1;
        Long phoneNum = 15711404444L;
        double height = 180.5;
        float weight = 140.5F;
        char sex = '男';
        boolean flag = true;
    }
}
