package com.ellen.lambda;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class Demo11 {

    public static void main(String[] args) {

        Stream stream = Stream.of("a","b");
        Object o[]=stream.toArray();
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i]);
        }



    }
}
