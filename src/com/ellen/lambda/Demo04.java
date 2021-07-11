package com.ellen.lambda;

import java.util.function.Function;

public class Demo04 {
    public static void main(String[] args) {
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start");
            }
        }).start();*/

        Function<Integer,Integer> function = (input) -> input+1;






    }


}
