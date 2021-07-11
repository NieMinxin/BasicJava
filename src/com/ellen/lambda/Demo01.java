package com.ellen.lambda;

public class Demo01 {

    public static void main(String[] args) {
       Te t = new Te() {
           @Override
           public void say() {
               System.out.println("hello");
           }
       };//抽象类
        t.say();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("th1");
                System.out.println(Thread.currentThread());
            }

        }).start();

        //JDK 8 LAMBDA 表达式
        new Thread(
                ()->{
                    System.out.println("thread-1");
                    System.out.println(Thread.currentThread());
                }
        ).start();






        System.out.println(Thread.currentThread());
    }
}
