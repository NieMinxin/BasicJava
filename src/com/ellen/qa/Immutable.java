package com.ellen.qa;

import java.util.Date;

public final class Immutable implements Cloneable{
    private final Integer age;

    private final String name;

    private final Date time;

    Immutable(Integer age, String name, Date time){
        this.age = age;
        this.name = name;
        this.time = new Date(time.getTime());
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    //���ɱ��෵�����ú�Σ��
    public Date getTime() {
        return new Date(time.getTime());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
