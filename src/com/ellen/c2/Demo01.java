package com.ellen.c2;

public class Demo01 {

    String str ="��Ա����" ;

    static  int age;



    Demo01(){
        System.out.println("���췽��");
        System.out.println(str);
    }

    static {
        new Demo01();
    }


    static {
        age = 10;
        System.out.println("��̬����� == one");
        System.out.println("age = "+age);
    }




    {
        System.out.println("ʵ�������");

    }

    public static void main(String[] args) {
        System.out.println("main ����");
    }

}
