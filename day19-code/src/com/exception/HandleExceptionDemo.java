package com.exception;
/*
    异常的处理方式:
        1.try...catch捕获异常
        好处:异常对象可以被捕获，后续的代码可以继续执行
        格式:
            try｛
                可能会出现异常的代码
            }catch(异常名称 对象名){
                异常的处理方案
            ｝
        执行流程:
        1.执行 try {}中的代码，看是否有异常对象产生
        2.没有 :catch就不会捕获，后续代码继续执行
        3.有 : catch捕获异常对象，执行catch {} 中的处理方案，后续代码继续执行

        2.throws 抛出异常
 */
public class HandleExceptionDemo {
    public static void main(String[] args) {
        System.out.println("开始");

        try {
            int[] arr = null;
            System.out.println(arr[10]);
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("结束");

    }
}
