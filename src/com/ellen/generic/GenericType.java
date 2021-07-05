package com.ellen.generic;

import java.lang.reflect.Type;

public class GenericType <T>{
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) throws InstantiationException,IllegalAccessException{
        GenericType<String > genericType = new GenericType<>();
        Type superclass = genericType.getClass().getGenericSuperclass();


    }
}
