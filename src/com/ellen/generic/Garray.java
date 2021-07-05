package com.ellen.generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garray {
    public static void main(String[] args) {
        List<?> list[] = new ArrayList<?>[10];

        Integer integers[] = {1,2,3,4,5};
        func(integers);


    }

    public static <T>  T[] func1(T ...args) {
        return args;
    }


    public static <T> void func(T para[]) {
        for (T t:para
             ) {
            System.out.println(t);
        }
    }

    //合理使用
    public static  <T> T[] func2(Class<T> type,int size){
        T t[] = (T[]) Array.newInstance(type,size);
        return t;
    }
}
