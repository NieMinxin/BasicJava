package com.ellen.c1;

import java.util.HashSet;

public class StringCopy {
    String string ;
    final int a =10;
    //a=11; 编译器报错



    public static void main(String[] args) {
        final Object object = new Object();
        StringCopy stringCopy = new StringCopy();
        // object = stringCopy;编译器报错
        String string1 = new String();

        String s1 = "abcd";
        s1 = s1.substring(0,2);
        System.out.println(s1);


        //
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(new String("a"));
        hashSet.add(new String("b"));
        hashSet.add(new String("c"));

        for (String e : hashSet){
            System.out.println(e.hashCode());
            e = "a";
            System.out.println(e);
        }


    }
}
