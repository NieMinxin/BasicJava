package com.ellen.lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Demo03 {
    public static void main(String[] args) {
        Runnable runnable = ()->{System.out.println("hello");};
        runnable.run();

        BinaryOperator<Long> add = (Long x,Long y)-> x+y;

        Consumer consumer = str-> {System.out.println("str");

        };


    }
}
