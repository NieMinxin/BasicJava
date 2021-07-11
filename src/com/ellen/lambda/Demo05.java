package com.ellen.lambda;

public class Demo05 {

    public static void main(String[] args) {
        InterfaceA interfaceA = (str)->{
            return str.toUpperCase();
        };
        System.out.println(interfaceA.Upper("sssss"));

    }

}
