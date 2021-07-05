package com.ellen.annotation;

import com.ellen.c4.Obj;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestMethodAnnotation {

    @Override
    @MyMethodAnnotation(title = "toString",description = "override toString")
    public String toString() {
        return "Override toString method";
    }
    @Deprecated
    @MyMethodAnnotation(title = "oldMethod",description = "oldMethod")
    public static  void oldMethod() {
        System.out.println("old method");
    }
    //uncheck 抑制 类型检查
    //deprecation 抑制过期方法
    @SuppressWarnings({"uncheck","deprecation"})
    @MyMethodAnnotation(title = "func function",description = "suppress warning static method")
    public static void func() {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("aaa");
        oldMethod();

    }

    public static void main(String[] args) {
        try {

            //反射 获取方法 ，@Target 根据
            Method methods[] = TestMethodAnnotation.class.getClassLoader().
                    loadClass("com.ellen.annotation.TestMethodAnnotation").getMethods();
            for (Method m: methods
                 ) {
                //判断 方法上是否有注解
                if(m.isAnnotationPresent(MyMethodAnnotation.class)){

                    //获取方法上标注的注解
                    Annotation annotations[]  = m.getDeclaredAnnotations();

                    for (Annotation annotation : annotations){
                        System.out.println(annotation);
                    }

                    //获取方法上指定注解的信息
                    MyMethodAnnotation myMethodAnnotation = m.getAnnotation(MyMethodAnnotation.class);
                    System.out.println(myMethodAnnotation.title());
                    System.out.println(myMethodAnnotation.description());

                }
            }
        }catch (Exception e){

        }
    }
}
