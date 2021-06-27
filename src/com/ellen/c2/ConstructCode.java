package com.ellen.c2;

public class ConstructCode {
    static {
        new ConstructCode();
    }
    {
        System.out.println("构造代码块");
    }

    ConstructCode(){
        System.out.println("构造器");
    }


    public static void main(String[] args) {
        new ConstructCode();
        new ConstructCode();
    }
}
