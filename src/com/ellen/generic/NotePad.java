package com.ellen.generic;

public class NotePad<K, V>{

    private K name;
    private V age;

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    NotePad(K name,V age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "NotePad{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        NotePad<String,Integer> notePad = new NotePad<>("ellen",18);

    }


    public <T> T getObje(Class<T> c) throws InstantiationException, IllegalAccessException {
        T t = c.newInstance();
        return t;
    }

    public <T extends Comparable<? super String>> T func() {
        return null;
    }


}
