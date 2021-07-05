package com.ellen.c3;

public class Hash {
    private  int x;
    private int y;
    private int z;
    Hash(){}

    Hash(int x,int y,int z){
        this.x =x;
        this.y = y;
        this.z =z;

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + z;
        return result;
    }

    public static void main(String[] args) {
        Hash hash = new Hash();
        Hash hash1 = new Hash();
        System.out.println(hash.equals(hash1));
    }
}
