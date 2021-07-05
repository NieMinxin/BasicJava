package com.ellen.generic;

public class Demo03 extends Demo02{
    @Override
    public void func(String name) {
        System.out.println("demo03 hello"+name);
    }


    public  void func(int age) {
        System.out.println("hello"+age);
    }

    public static void main(String[] args) {
        Demo03 demo03 = new Demo03();
        demo03.func("ellen");
    }
}
