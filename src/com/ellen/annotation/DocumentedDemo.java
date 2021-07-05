package com.ellen.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD,ElementType.FIELD})
public @interface DocumentedDemo {
    String value() default "demo";
}
