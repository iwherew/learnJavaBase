package reflect;

import java.lang.reflect.Constructor;

/*
    反射类中的构造方法
    1.Constructor<?>[] getConstructors()        返回所有公共构造方法对象的数组
    2.Constructor<?>[] getDeclaredConstructors() 返回所有构造方法对象的数组
    3.Constructor<T> getConstructor(Class<?>... parameterTypes)         返回单个公共构造方法对象
    4.Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 返回单个构造方法对象

    创建对象的方法
    1.T newInstance(Object...initArgs) 根据指定的构造方法创建对象
    2.setAccessible(boolean flag)  设置为true,表示取消访问检查
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        // 1.获取类的字节码对象
        Class<?> studentClass = Class.forName("reflect.domain.Student");

        // 2.反射构造方法对象
        Constructor<?> constructor = studentClass.getConstructor(String.class, int.class);
        // 访问非public的构造方法需要取消访问检查
//        constructor.setAccessible(true);

        // 3.通过构造方法对象，完成实例化
        Object o = constructor.newInstance("Amadeus", 25);
        System.out.println(o);

    }
}
