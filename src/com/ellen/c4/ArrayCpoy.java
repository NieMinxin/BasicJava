package com.ellen.c4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCpoy {
    public static void main(String[] args) {
        System.out.println("enter:");

        int array[] = {1,2,3,4,5};


        for(int j  : array){
            System.out.println(j);
        }
        int array1[] = new int[5];
        int array2[];

        array1 = Arrays.copyOf(array,array1.length);

        System.out.println("array.copyOf");
        for (int j: array1){
            System.out.println(j);
        }

        array2 = array.clone();

        System.out.println("clone");
        for (int j : array2){
            System.out.println(j);
        }

    }
}
