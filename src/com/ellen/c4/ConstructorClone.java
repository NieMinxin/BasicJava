package com.ellen.c4;

public class ConstructorClone {
    private int[] arr;
    ConstructorClone(){
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =i;
        }
        //初始化
    }

    ConstructorClone(ConstructorClone origin){
        this.arr = new int[origin.arr.length];
        for (int i = 0; i < origin.arr.length; i++) {
            this.arr[i] = origin.arr[i];
        }
    }


    public void set(int index, int value) {
        arr[index] = value;
    }

    public int get(int index) {
        return arr[index];
    }

}
