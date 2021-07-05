package com.ellen.generic;

public class Overload {

    public static void main(String[] args) {

    }

    public <T extends Number> int add(T a, T b){
        return  a.intValue() + b.intValue();
    }
}
