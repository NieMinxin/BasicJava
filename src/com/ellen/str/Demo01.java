package com.ellen.str;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class Demo01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "hello,world";
        Map<Character,Integer> map = new HashMap<>();
        for(char character : str.toCharArray()){
            Integer value  =  map.get(character);
            int newValue = (value ==null) ? 1 : Integer.sum(value,1);
            map.put(character,newValue);
        }
        System.out.println(map);

        /*for (char c : str.toCharArray()){
            map.merge(c,1,Integer::sum);
        }*/
        byte bytes[] = new byte[10];
        String str1 = new String(bytes,"utf-8");
    }
}
