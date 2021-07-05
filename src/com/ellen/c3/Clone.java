package com.ellen.c3;

public class Clone implements Cloneable{

    public static void main(String[] args) throws Exception{
        Clone  clone = new Clone();

        Clone clone1 = (Clone) clone.clone();
        System.out.println(clone==clone1);
        System.out.println(clone);
        System.out.println(clone1);
        System.out.println(clone.getClass()==clone1.getClass());
        System.out.println(clone.equals(clone1));

    }
}
