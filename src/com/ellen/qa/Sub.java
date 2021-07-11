package com.ellen.qa;

public class Sub extends Super implements Cloneable{
    Sub(){}

    public static void main(String[] args) {
        Super s = new Sub();//向上转型
        Super s1 = (Sub)s;//向下转型

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
