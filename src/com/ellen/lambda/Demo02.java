package com.ellen.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) {
        List list = Arrays.asList("i","love","you");
        //����
        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if(o1==null)
                    return -1;
                if(o2==null)
                    return 1;
                return o2.length()-o1.length();
            }
        });
        //lambda
        Collections.sort(list, (String s1, String s2) ->{// ʡ�Բ����������
            if(s1 == null)
                return -1;
            if(s2 == null)
                return 1;
            return s2.length() - s1.length();
        });




    }
}
