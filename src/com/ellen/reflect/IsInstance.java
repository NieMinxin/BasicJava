package com.ellen.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class IsInstance {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c = StringBuilder.class;
        StringBuilder sb = new StringBuilder("1");
        System.out.println(c.isInstance(sb));

        try {
            StringBuilder sb1 = (StringBuilder) c.newInstance();//newInstance
            StringBuilder sb2 = (StringBuilder) c.newInstance();
            Constructor constructor = c.getConstructor(StringBuilder.class);
            StringBuilder sb3 = (StringBuilder) constructor.newInstance("111");

            System.out.println(sb1.hashCode());
            System.out.println(sb2.hashCode());
            System.out.println(sb3.hashCode());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Class c1 = String.class;
        Constructor constructor = c1.getConstructor(String.class);
        String s1 = (String) constructor.newInstance("hello");
        System.out.println(s1);
    }
}
