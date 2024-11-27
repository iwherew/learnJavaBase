package my_enum;
/*
    枚举介绍:Java中的一种特殊的类型，常用于信息的标志和分类
        1.常量
        2.枚举:入参严谨，提示性更强，代码优雅
 */
public class EnumTest {
    public static void main(String[] args) {
        method(Season.AUTUMN);
    }

    public static void method(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("春季");
                break;
            case SUMMER:
                System.out.println("夏季");
                break;
            case AUTUMN:
                System.out.println("秋季");
                break;
            case WINTER:
                System.out.println("冬季");
                break;
        }
    }
}

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;
}