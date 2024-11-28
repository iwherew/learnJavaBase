package anno;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        Class<AnnoDemo3> aClass = AnnoDemo3.class;
        AnnoDemo3 anno = aClass.getConstructor().newInstance();
        // 通过找字节码对象反射类中所有的成员方法
        Method[] methods = aClass.getMethods();

        // 遍历数组，获取每一个成员方法
        for (Method method : methods) {
            // 看这个方法上面，是否存在@MyTest注解
            if(method.isAnnotationPresent(MyTest.class)){
                // 存在：让方法执行起来
                method.invoke(anno);
            }
        }
    }
}
