package com.ellen.c2;

public class ConstructCode {
    static {
        new ConstructCode();
    }
    {
        System.out.println("��������");
    }

    ConstructCode(){
        System.out.println("������");
    }


    public static void main(String[] args) {
        new ConstructCode();
        new ConstructCode();
    }
}
