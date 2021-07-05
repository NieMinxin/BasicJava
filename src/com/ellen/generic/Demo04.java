package com.ellen.generic;

import java.util.ArrayList;
import java.util.List;

public class Demo04 {
    public static void main(String[] args) {
        ArrayList arrayList[] = new ArrayList[10];
        ArrayList<?> arrayList1[] = new  ArrayList<?>[10];//ok
        List<String>[] list13 = (List<String>[]) new ArrayList<?>[10];
        //ArrayList<String> arrayList2[] = new ArrayList<String>[10]; error

    }
}
