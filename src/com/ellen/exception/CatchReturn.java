package com.ellen.exception;

public class CatchReturn {
    public static String func() {


        try {
            testNPE();
            return  "OK";
        } catch (Exception e) {
            return "ERROR";
        } finally {
            System.out.println("tryCatchReturn");
        }
    }

    private static void testNPE() {
        throw  new NullPointerException();
    }

    public static void main(String[] args) {
        String s  = func();
        System.out.println(s);
    }
}
