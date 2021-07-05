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
    //uncheck ���� ���ͼ��
    //deprecation ���ƹ��ڷ���
    @SuppressWarnings({"uncheck","deprecation"})
    @MyMethodAnnotation(title = "func function",description = "suppress warning static method")
    public static void func() {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("aaa");
        oldMethod();

    }

    public static void main(String[] args) {
        try {

            //���� ��ȡ���� ��@Target ����
            Method methods[] = TestMethodAnnotation.class.getClassLoader().
                    loadClass("com.ellen.annotation.TestMethodAnnotation").getMethods();
            for (Method m: methods
                 ) {
                //�ж� �������Ƿ���ע��
                if(m.isAnnotationPresent(MyMethodAnnotation.class)){

                    //��ȡ�����ϱ�ע��ע��
                    Annotation annotations[]  = m.getDeclaredAnnotations();

                    for (Annotation annotation : annotations){
                        System.out.println(annotation);
                    }

                    //��ȡ������ָ��ע�����Ϣ
                    MyMethodAnnotation myMethodAnnotation = m.getAnnotation(MyMethodAnnotation.class);
                    System.out.println(myMethodAnnotation.title());
                    System.out.println(myMethodAnnotation.description());

                }
            }
        }catch (Exception e){

        }
    }
}
