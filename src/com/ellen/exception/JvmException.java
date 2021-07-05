package com.ellen.exception;

public class JvmException {
    public void fun() {
        System.out.println("fun");
        throw new NullPointerException();
    }


    public static void main(String[] args) {

        JvmException jvmException = new JvmException();
        try {
            jvmException.fun();
        }catch (NullPointerException e){
            e.printStackTrace(System.out);
        }

    }
}
