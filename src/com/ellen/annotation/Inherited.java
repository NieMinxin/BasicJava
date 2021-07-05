package com.ellen.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

@InheritedTest(value = "hello",number=10)
public class Inherited {



}

class SubInherited extends Inherited{
    public static void main(String[] args) {
        Class c = SubInherited.class;
        Annotation annotations[] = c.getAnnotations();

        for (Annotation a: annotations
             ) {
            System.out.println(a.annotationType());
            System.out.println(a.toString());
        }


    }
}



