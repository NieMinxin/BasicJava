package com.ellen.c1;

import java.util.GregorianCalendar;

public class Sb {

    public static void main(String[] args) {
       /* System.currentTimeMillis();
        System.out.println("string buffer");
        test1();
        System.out.println("string builder");
        test2();
        */

        StringBuilder sb = new StringBuilder("hello");
        sb.append(1);
        sb.append("world");
        int index = sb.indexOf("d");
        System.out.println(String.format("index : %d", index));
        System.out.println(sb.toString());
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
        sb.insert(0,'h');
        System.out.println(sb);
    }
    public static  void test1(){
        System.gc();
        long start=new GregorianCalendar().getTimeInMillis();
        long startMemory=Runtime.getRuntime().freeMemory();
        StringBuffer sb = new StringBuffer();
        //StringBuilder sb = new StringBuilder();
        for(int i = 0; i<100000; i++){
            sb.append(":").append(i);
        }
        long end=new GregorianCalendar().getTimeInMillis();
        long endMemory=Runtime.getRuntime().freeMemory();
        System.out.println("Time Taken:"+(end-start));
        System.out.println("Memory used:"+(startMemory-endMemory));
    }

    public static  void test2(){
        System.gc();
        long start=new GregorianCalendar().getTimeInMillis();
        long startMemory=Runtime.getRuntime().freeMemory();
        StringBuilder sb = new StringBuilder();
        //StringBuilder sb = new StringBuilder();
        for(int i = 0; i<100000; i++){
            sb.append(":").append(i);
        }
        long end=new GregorianCalendar().getTimeInMillis();
        long endMemory=Runtime.getRuntime().freeMemory();
        System.out.println("Time Taken:"+(end-start));
        System.out.println("Memory used:"+(startMemory-endMemory));
    }
}
