package com.ellen.qa;

public class Sub extends Super implements Cloneable{
    Sub(){}

    public static void main(String[] args) {
        Super s = new Sub();//����ת��
        Super s1 = (Sub)s;//����ת��

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
