package com.ellen.c2;

public class Super {

    private int a;

    Super(){

    }

    Super(int a){
        this.a = a;
    }

    public void func(){
        System.out.println(toString());//打印sub
        System.out.println(this.a);
    }

}
