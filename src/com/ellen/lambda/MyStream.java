package com.ellen.lambda;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T>{
    private List<T> list = new ArrayList<>();

    //�ӿ���Ϊ�������������ǽ��ӿڵ�ʵ���࣬��Ϊ�������ݽ��������ڿ���ֱ��ʹ�� �����ڲ�����ʵ�֣�lambda��������һ��˼��
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
