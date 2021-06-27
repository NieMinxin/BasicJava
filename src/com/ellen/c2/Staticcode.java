package com.ellen.c2;

public class Staticcode {
    static {
        data =1;
    }

    public static void main(String[] args) {
        System.out.println("data = "+ data);
    }

    private static int data =2;
}
