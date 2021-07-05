package com.ellen.c3;

public class Equals {

    private String name;


    @Override
    public boolean equals(Object obj) {

        return this == obj;
    }

    public static void main(String[] args) {


    }

    public static String Single(Equals equals){
        //将地址的值传入进来,而不是将该引用传递
        //其中函数中也会创建一个该参数的 Equals 对象
        return equals.name;
    }
}
