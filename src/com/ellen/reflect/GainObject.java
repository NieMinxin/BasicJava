package com.ellen.reflect;

public class GainObject {
    //
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.ellen.c1.Cache");//动态的加载 Cache class ，它不需要事先（写代码的时候或编译期）知道运行Class对象是谁
        Class intc = Integer.class;
        System.out.println(intc.getName());
        Class c = Integer.TYPE;

        StringBuilder sb = new StringBuilder("123");
        Class c1 = sb.getClass();

        System.out.println(c1);



    }
}
