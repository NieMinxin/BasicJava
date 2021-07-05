package com.ellen.exception;

public class StackException {
    public static void main(String[] args) throws Exception{
        try {
            int a = 10/0;
        }catch (Exception e){
            e.printStackTrace();
            StackTraceElement stackTraceElement[] = e.getStackTrace();
            System.out.println(stackTraceElement.length);
            for (StackTraceElement se:stackTraceElement){
                System.out.println(se.getMethodName());
            }
        }
    }
}
