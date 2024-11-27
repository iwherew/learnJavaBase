package reflect;

import reflect.domain.Student;

import java.lang.reflect.Method;

/*
    反射类中的成员方法
    1. Method[] getMethods() 返回所有公共成员方法对象的数组，包括继承的
    2. Method[] getDeclaredMethods() 返回所有成员方法对象的数组，不包括继承的
    3. Method getMethod(String name, Class<?>... parameterTypes) 返回单个公共成员方法对象
    4. Method getDeclaredMethod(String name, Class<?>... parameterTypes) 返回单个成员方法对象

    Method类的执行方法
    Object invoke(Object obj, Object... args) 运行方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Class<Student> studentClass = Student.class;
        // 通过字节码对象，返回内部的成员方法对象（所有public修饰的）
        Method[] methods = studentClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        // 通过字节码对象，反射指定的成员方法对象
        Method eatMethod = studentClass.getMethod("eat", int.class);

        Student stu = studentClass.getConstructor().newInstance();
        // 让反射到的成员方法执行
        eatMethod.invoke(stu, 5);

    }
}
