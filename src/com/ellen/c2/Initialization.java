package com.ellen.c2;

import java.lang.reflect.Constructor;

public class Initialization{

    private  int age;
    private String name;
    public Initialization(){

    }

    public Initialization(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Initialization{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    private void print(){
        toString();
    }

    public static void main(String[] args) throws Exception {

    }

    public static Initialization initlizater(Integer age, String name) throws Exception{
        Constructor<Initialization> constructor = Initialization.class.getConstructor();
        Constructor<Initialization> constructor1 = Initialization.class.getConstructor(Integer.class,String.class);
        return  age <= 0 || name == null ? constructor.newInstance() : constructor1.newInstance(age, name);
    }

}
