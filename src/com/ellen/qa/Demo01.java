package com.ellen.qa;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;

public class Demo01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        BigDecimal  bd = new BigDecimal(1908);

        System.out.println(bd);

        byte bt[] = new byte[1];


        String s = new String(bt,"utf-8");



    }
}
