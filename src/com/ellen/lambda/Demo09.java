package com.ellen.lambda;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo09 {

    public static void main(String[] args) {
        Map<String,Integer> map  = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        System.out.println(map);

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            String key = iterator.next().toString();
            Integer value = map.get(key);
            System.out.println(new StringBuilder().append("key:").append(key).append("\tvalue:").append(value));
        }

        map.forEach((k,v)->{
            System.out.println(k+v);
        });

        System.out.println(map.getOrDefault("one",1));
        Integer ve = map.putIfAbsent("one",1);//作用是只有在不存在key值的映射或映射值为null时
        System.out.println(ve);

        //repalceAll
       map.replaceAll((k,v)->{
           return v= v+1;
       });

       System.out.println(map);

       System.out.println("merge()");
       map.merge("one",1,(k1,v1)-> k1+v1);
       System.out.println(map);

    }
}
