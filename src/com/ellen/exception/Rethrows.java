package com.ellen.exception;

public class Rethrows {

    public static void fun1() throws Exception {
        throw new Exception("fun1");
    }

    public static void fun2() throws Exception {
        try {
            fun1();
        }catch (Exception e){
            //e.fillInStackTrace(); 覆盖前面的异常信息
            System.out.println("fun2");
            throw e;
        }
    }

    public static void main(String[] args)  {
        try {
            fun2();
        } catch (Exception e) {
            System.out.println("main");
            e.printStackTrace(System.out);

        }
    }
}
