package com.ellen.generic;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        List<String> list1 = new ArrayList<>();

        list1.add("a");

        list1.getClass().getMethod("add",Object.class).invoke(list1,1);

        System.out.println(list1);

        //list1.add(1); error 说明参数化类型 是再编译前检查的


    }
}
