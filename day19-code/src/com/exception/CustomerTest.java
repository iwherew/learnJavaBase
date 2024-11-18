package com.exception;

public class CustomerTest {
    public static void main(String[] args) {
        int age = -15;

        try{
            if(age >= 0 && age <= 120){
                System.out.println("通过");
            }else{
                throw new CustomerException("年龄范围有误");
            }
        } catch (CustomerException e) {
            System.out.println(e.getMessage());
        }
    }
}
