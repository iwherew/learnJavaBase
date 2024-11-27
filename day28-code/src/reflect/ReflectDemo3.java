package reflect;

import reflect.domain.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
    反射类中的成员变量
        1. Field[] getFields() 返回所有公共成员变量对象的数组
        2. Field[] getDeclaredFields() 返回所有成员变量对象的数组
        3. Field getField(String name) 返回单个公共成员变量对象
        4. Field getDeclaredField(String name) 返回单个成员变量对象

    Field类的设置和获取方法
        1. void set(Object obj, Object value) 赋值
        2. Object get(Object obj) 获取值
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        // 1.获取类的字节码对象
        Class<Student> studentClass = Student.class;
        // 2.暴力反射内部成员变量对象
        Field ageField = studentClass.getDeclaredField("age");
        Field nameField = studentClass.getDeclaredField("name");
        // 3.设置访问权限
        ageField.setAccessible(true);
        nameField.setAccessible(true);

        Constructor<Student> constructor = studentClass.getConstructor();
        Student stu1 = constructor.newInstance();
        Student stu2 = constructor.newInstance();

        // 4.使用成员变量对象，完成赋值和获取操作
        ageField.set(stu1, 25);
        nameField.set(stu1,"amadeus");
        System.out.println(stu1);
        System.out.println(ageField.get(stu1));
        System.out.println(nameField.get(stu1));

        ageField.set(stu2, 18);
        nameField.set(stu2,"iwhere");
        System.out.println(stu2);
    }
}
