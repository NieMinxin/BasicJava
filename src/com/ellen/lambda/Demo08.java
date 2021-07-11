package com.ellen.lambda;

import java.util.*;

public class Demo08 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hello","world","love"));

        /*Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            if(str.length()>=3){
                iterator.remove();
            }
        }
        list.add("hello");
        System.out.println(list);

        list.removeIf(
                str->{
           return str.length()>=3;
        }
        );*/


        Spliterator spliterator = list.spliterator();
        System.out.println(spliterator.tryAdvance(System.out::println));


    }
}
