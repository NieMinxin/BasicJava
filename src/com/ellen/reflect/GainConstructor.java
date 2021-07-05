package com.ellen.reflect;

import com.ellen.c4.Obj;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GainConstructor {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c = String.class;
        Constructor constructor  = c.getConstructor(String.class);
        Object obj = constructor.newInstance("hello");
        System.out.println(obj);
    }
}
