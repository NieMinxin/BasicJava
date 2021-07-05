package com.ellen.annotation;

import java.lang.annotation.Annotation;

public class Test1 {

    public static void main(String[] args) {
        Class c = ClassPolicy.class;
        Annotation annotation[] =  c.getAnnotations();
        System.out.println(annotation.length);
        for (Annotation a :annotation
                ) {
            System.out.println(a.toString());
        }

    }
}
