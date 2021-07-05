package com.ellen.exception;

public class ExceptionTest {

    private int testTimes;

    public ExceptionTest(int testTimes) {
        this.testTimes = testTimes;
    }

    public void newObject() {
        long time = System.nanoTime();
        for (int i = 0; i < testTimes; i++) {

            new Object();
        }
        System.out.println(String.format("it takes = :\t %d",System.nanoTime()-time ));

    }

    public void newException() {

        long time = System.nanoTime();
        for (int i = 0; i <testTimes ; i++) {
            new Exception();
        }
        System.out.println(String.format("it takes = :\t %d",System.nanoTime()-time ));
    }

    public void newHandleEx() {
        long time =System.nanoTime();
        for (int i = 0; i < testTimes; i++) {

            try {
                throw  new Exception();
            }catch (Exception e){


            }

        }
        System.out.println(String.format("it takes = :\t %d",(System.nanoTime()-time) ));
    }

    public static void main(String[] args) {
        ExceptionTest test  = new ExceptionTest(1000);
        test.newObject();
        test.newException();
        test.newHandleEx();

    }
}
