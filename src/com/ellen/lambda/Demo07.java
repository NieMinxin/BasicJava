package com.ellen.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Demo07 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("HELLO","WORLD","LOVE","YOU"));
        for (String str:arrayList
             ) {
            if(str.length()>=3){
                System.out.println(str);
            }
        }

        System.out.println("-------------------------------");

        arrayList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                if(s.length()>=3){
                    System.out.println(s);
                }
            }
        });

        System.out.println("-------------------------------lambda");
        arrayList.forEach((str)->{
            if(str.length()>=3){
                System.out.println(str);
            }
        });

        System.out.println("-------------------------------");


        Map<String,Integer> map = new HashMap<>();
        map.put("s",1);

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+":" +entry.getValue());
        }


    }
}
