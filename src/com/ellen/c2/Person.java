package com.ellen.c2;

public class Person {
    String name;

    Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {

        Person person = new Person("zhangsan");
        System.out.println(person);
        func(person);



    }

    public String getAdderss() {
        return super.toString();
    }

    public static  void func(Person person){
        person = new Person("lisi");

        System.out.println(person.name);
        System.out.println(person.getAdderss());
    }


}
