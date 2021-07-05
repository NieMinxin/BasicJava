package com.ellen.reflect;


import java.lang.reflect.Method;

public class GainInvoke {
    public static void main(String[] args) throws Exception{
        Class cls  = TestMain.class;
        Object obj = cls.newInstance();
        Method method = cls.getMethod("say");
        method.invoke(obj);
    }
}
