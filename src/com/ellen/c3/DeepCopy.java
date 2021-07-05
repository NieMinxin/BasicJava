package com.ellen.c3;

import java.io.*;

public class DeepCopy {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream = null;//对象输出流
        ObjectInputStream objectInputStream = null;//对象输入流
        Serialization serialization1;
        try {
            Serialization serialization = new Serialization(100, 100);// 创建原始的可序列化对象
            System.out.println(serialization);

            //通过序列化实现深拷贝
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(bos);//对象输出流
            objectOutputStream.writeObject(serialization);
            objectOutputStream.flush();//刷新缓冲区,直接输出到指定位置
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());//将对象流的数据转换成byte[] 数组 作为输入流传入
            objectInputStream = new ObjectInputStream(bis);

            serialization1 = (Serialization) objectInputStream.readObject();

            System.out.println(serialization1);

            //改变原始对象
            serialization.setX(150);
            serialization.setY(150);

            System.out.println("改变后");
            System.out.println(serialization);
            System.out.println(serialization1);

            System.out.println(serialization.hashCode());
            System.out.println(serialization1.hashCode());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            //finally 块负责清理流
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            if (objectOutputStream != null) {
                objectOutputStream.close();

            }
        }
    }

}
