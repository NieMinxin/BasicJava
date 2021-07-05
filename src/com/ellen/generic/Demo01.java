package com.ellen.generic;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList list1 = new ArrayList<String>();

        //list.add(1); ERROR
        list1.add(1);
        System.out.println("hello,world");
    }

    public static <T> T getObje(Class<T> cla) throws InstantiationException, IllegalAccessException {
        T obj =cla.newInstance();
        return obj;
    }
}
