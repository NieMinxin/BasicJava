package com.ellen.reflect;

import java.lang.reflect.Method;

public class GainMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class sb = Class.forName("java.lang.StringBuilder");
        StringBuilder stringBuilder = (StringBuilder) sb.newInstance();

        Method method[] = sb.getMethods();
        for (Method m: method){
            System.out.println(m);
        }
        System.out.println("------------------------------------");
        Method method1[] = sb.getDeclaredMethods();
        for (Method m: method1){
            System.out.println(m.getName());
        }
    }
}
