package com.permissions;

/*
    权限修饰符
        private :同一个类中
        (default):同一个类中，同一个包中
        protected:同一个类中，同一个包中，不同包的子类（继承）
        public: 任意位置访问
 */

public class Student {
    private int age;

    public void show(){
        System.out.println("Age is " + age);
        System.out.println("show...");
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }else {
            System.out.println("Age is out of range");
        }
    }

    public int getAge() {
        return age;
    }
}
