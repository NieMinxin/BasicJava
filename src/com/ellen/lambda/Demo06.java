package com.ellen.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Demo06 {
    public static void main(String[] args) {
        new Random().ints(0,100).distinct().limit(50).forEach(System.out::println);

        List list = Arrays.asList("hello","world");
        list.forEach(System.out::println);
    }
}
