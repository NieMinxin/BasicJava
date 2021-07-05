package com.ellen.annotation;

import java.lang.annotation.*;
import java.lang.annotation.Inherited;

@Target({ElementType.METHOD,ElementType.TYPE})

@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface InheritedTest {
    String value();
    int number();
}


