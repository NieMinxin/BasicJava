package com.ellen.util;

import java.util.UUID;

public class UUIDdemo {
    public static void main(String[] args) {
        String id = UUID.randomUUID().toString().replaceAll("-","");
        System.out.println(id);
    }
}
