package com.ellen.str;

public class Demo02 {
    public static void main(String[] args) {
        //反转字符串
        String s = "hello,world";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);

        String s1 = "ddd ddd";
        boolean res = true;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s1.charAt(s1.length()-1-i))
                res = false;
                break;

        }
        System.out.println(res);


    }
}
