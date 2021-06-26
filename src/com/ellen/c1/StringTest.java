package com.ellen.c1;

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("abcd");
        String s2 = new String("abcd");

        System.out.println(s1==s2);//falsse
        System.out.println(s1.equals(s2));



        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3==s4);//true


        String s5 = "A";

        for (int i = 0; i < 100; i++) {
            s5 = s5 + i;
        }
        System.out.println(s5);//效率及其地下

    }
}
