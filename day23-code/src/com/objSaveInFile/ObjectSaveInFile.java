package com.objSaveInFile;

import java.io.*;

/*
    序列化流读写对象
        序列化:将对象写出到文件
            public ObjectOutputStream(OutputStream out)
        反序列化:从文件中将对象读取到程序
            public ObjectInputStream(InputStream in)
            
    注意事项：类需要实现 Serializable 接口
            idea勾选上： Serializable class without serialVersionUlD
 */
public class ObjectSaveInFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writeObj();
//        readObj();
        readMoreObj();
    }

    private static void readMoreObj() throws IOException, ClassNotFoundException {
        // 一般写入的时候可以用List一次性写入写出
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day23-code/src/com/objSaveInFile/data.txt"));
        while(true){
            try {
                Student stu = (Student) ois.readObject();
                System.out.println(stu);
                System.out.println(stu.getName());
            }catch (EOFException e){
                break;
            }
        }
        ois.close();
    }

    private static void readObj() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day23-code/src/com/objSaveInFile/data.txt"));
        Student stu = (Student) ois.readObject();
        System.out.println(stu);
        System.out.println(stu.getName());
        ois.close();
    }

    private static void writeObj() throws IOException {
        Student stu = new Student("张三",23);
        Student stu2 = new Student("李四",24);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day23-code/src/com/objSaveInFile/data.txt"));

        oos.writeObject(stu);
        oos.writeObject(stu2);

        oos.close();
    }
}

class Student implements Serializable {
    private String name;
    private int age;
    private transient String address; // transient 关键字让这个属性不进行序列化操作

    @Serial
    private static final long serialVersionUID = 6091092215391500963L; // serialVersionUID 修改类的时候不报错

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
