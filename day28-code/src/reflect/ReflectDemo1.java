package reflect;

import reflect.domain.Student;
/*
    获取字节码文件的三种方法
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1. 通过Class的静态方法forName
        Class<?> class1 = Class.forName("reflect.domain.Student");

        // 2. 类名.class
        Class<Student> class2 = Student.class;

        // 3. Object 类中的 getClass()
        Student stu = new Student();
        Class<? extends Student> class3 = stu.getClass();

        System.out.println(class1); // class reflect.domain.Student
        System.out.println(class2); // class reflect.domain.Student
        System.out.println(class3); // class reflect.domain.Student

        // 类的字节码文件只有一份
        System.out.println(class1 == class2); // true
        System.out.println(class1 == class3); // true
    }
}
