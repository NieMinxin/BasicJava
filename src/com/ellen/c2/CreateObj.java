package com.ellen.c2;

import java.lang.reflect.Constructor;

public class CreateObj implements Cloneable{


    public static void main(String[] args) {
        CreateObj  cj = new CreateObj();
        System.out.println(cj);
        try {
            CreateObj cj1 = (CreateObj) Class.forName("com.ellen.c2.CreateObj").newInstance();
            System.out.println(cj1);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //obj.clone()
        try {
            CreateObj createObj = (CreateObj) cj.clone();
            System.out.println(createObj);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //调用Class.getConstructor()方法获取无参默认构造Constructor时，如果用户自定义了有参构造函数，因
        // 为此时java并不会生成默认构造函数，
        // 所以Class.getConstructor()方法因找不到无参默认构造函数而抛异常。此时需要显示定义默认构造函数：


    }
}
