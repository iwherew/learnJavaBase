package com.set.treeSet.domain;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

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

    /*
        compareTo 方法的返回值:
        0: 只有第一个元素
        1: 正序排列
        -1: 倒序排列
        this.xxx - o.xxx 正序
        o.xxx - this.xxx 降序
     */
    @Override
    public int compareTo(Student o) {
        int ageDiff = this.age - o.age;
        if (ageDiff == 0) {
            int nameDiff = this.name.compareTo(o.name);
            return nameDiff == 0 ? 1 : nameDiff;
        }else{
            return ageDiff;
        }
    }
}
