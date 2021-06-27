package com.ellen.c2;

public class Demo01 {

    String str ="成员变量" ;

    static  int age;



    Demo01(){
        System.out.println("构造方法");
        System.out.println(str);
    }

    static {
        new Demo01();
    }


    static {
        age = 10;
        System.out.println("静态代码块 == one");
        System.out.println("age = "+age);
    }




    {
        System.out.println("实例代码块");

    }

    public static void main(String[] args) {
        System.out.println("main 方法");
    }

}
