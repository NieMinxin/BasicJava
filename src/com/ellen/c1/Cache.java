package com.ellen.c1;

public class Cache {

    public static void main(String[] args) {
        Integer integer = 12;


        Integer integer1 = 129;

        Integer integer2 = 129;
        Integer integer3 =12 ;
        System.out.println(integer==integer3);//true
        System.out.println(integer1==integer2);//false



        Float f = new Float(0);
        float f1 = 123.4f;

        f1 = Float.valueOf(f);

        System.out.println(f1);

        System.out.println(f);

        int min = Integer.MIN_VALUE/10;
        System.out.println(min);
    }
}
