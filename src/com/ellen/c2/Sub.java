package com.ellen.c2;

public class Sub extends  Super{

    private  int a;
    private int b;
    Sub(int a,int b){
        super(a);//父类的a 为private ，可以使用super对其初始化
        this.a = a;
        this.b = b;
    }

    @Override
    public void func() {
        super.func();
        System.out.println("this is  sub");
    }

    @Override
    public String toString() {
        return "Sub{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        Sub sub = new Sub(1,2);

        sub.func();
        System.out.println(sub);
        System.out.println(String.format("sub a is : %d", sub.a));
    }

}
