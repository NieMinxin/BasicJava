package com.ellen.c3;

public class Student implements Cloneable{

    private Student friend;
    private String name;

    public Student getFriend() {
        return friend;
    }

    public void setFriend(Student friend) {
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name,Student friend) {
        this.friend = friend;
        this.name = name;
    }
    public Student(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws Exception {
        Student ellen = new Student("ellen",new Student("bob"));
        Student jack  = (Student) ellen.clone();

        System.out.println(ellen);
        System.out.println("ellen 的朋友 ："+ellen.getFriend().getName());
        System.out.println(jack);
        System.out.println("jack 的朋友 ："+jack.getFriend().getName());
        System.out.println("ellen 改名");
        ellen.setName("ellenk");

        ellen.getFriend().setName("james");
        System.out.println(ellen);
        System.out.println("ellen 的朋友 ："+ellen.getFriend().getName());
        System.out.println(jack);
        System.out.println("jack 的朋友 ："+jack.getFriend().getName());





    }


}
