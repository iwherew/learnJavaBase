package anno;
/*
    JDK中常见注解
        @Override:表示方法的重写
        @Deprecated:表示修饰的方法已过时
        @SuppressWarnings("all"):压制警告

    在使用注解时，如果注解的属性没有给出默认值，需要手动给出
    @Anno(name="张三")
    如果数组中只有一个属性值，在使用时{}是可以省略的

    定义注解中如果有多个属性没有赋值，使用时需要全部赋值
    如果只有一个属性名字为value没有赋值，使用时直接给出值，不需要写属性名
 */

@SuppressWarnings("all")
public class AnnoDemo1 {
    public static void main(String[] args) {
        method();
        System.out.println(1 > 2 ? true : false);
    }

    @Deprecated
    public static void method(){

    }
}
