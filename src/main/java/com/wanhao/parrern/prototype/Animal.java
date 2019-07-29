package com.wanhao.parrern.prototype;

import java.io.*;

/**
 * Created by LiuLiHao on 2019/7/29 0029 下午 09:27
 * @author : LiuLiHao
 * 描述：
 */
public class Animal implements Serializable {
    private String name;
    private int age;

    private ZooKeeper zooKeeper;
    public Animal deepCopy(){
        //使用序列化方式
        ObjectOutputStream oos = null;
        ObjectInputStream ois= null;
        ByteArrayOutputStream bos= null;
        ByteArrayInputStream bis= null;


        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);

            //写出
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            //读入
            return (Animal) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ZooKeeper getZooKeeper() {
        return zooKeeper;
    }

    public void setZooKeeper(ZooKeeper zooKeeper) {
        this.zooKeeper = zooKeeper;
    }
}
