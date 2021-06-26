package com.ellen.c1;

public class Intern {
    public static void main(String[] args) {


        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);           // false
        String s3 = s1.intern();
        System.out.println(s1.intern() == s3);//true
    }
}
