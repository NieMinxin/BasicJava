package com.ellen.reflect;

import java.lang.reflect.Field;

public class GainFiled {
    public static void main(String[] args) {
        Class c = Test.class;
        Field fields[] = c.getFields();//获取父类
        for (Field field: fields){
            System.out.println(field);
        }
        Field fields1[] =c.getDeclaredFields();
        for (Field field: fields1){
            System.out.println(field);
        }
    }
}
