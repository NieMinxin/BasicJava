package com.ellen.c2;

public class Demo02 {

    static {
        System.out.println("one");
    }

    Demo02(){
        System.out.println("Gouzaoqi");
    }
    {
        System.out.println("two");
    }

    public static void main(String[] args) {
        new Demo02();
        System.out.println("main");
    }
}
