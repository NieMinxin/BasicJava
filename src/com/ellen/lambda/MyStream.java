package com.ellen.lambda;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T>{
    private List<T> list = new ArrayList<>();

    //接口作为参数，本质上是将接口的实现类，作为参数传递进来，现在可以直接使用 匿名内部类来实现，lambda就是这样一种思想
    public void foreach(InterfaceA<T> interfaceA){
        for (T t: list
             ) {

        }
    }

    public List<T> getList() {
        return list;
    }

    public static void main(String[] args) {
        MyStream<String> myStream = new MyStream<>();
        myStream.getList().add("hello");
        myStream.getList().add("world");


    }
}
