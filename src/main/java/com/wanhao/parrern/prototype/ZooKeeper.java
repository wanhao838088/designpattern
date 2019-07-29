package com.wanhao.parrern.prototype;

import java.io.Serializable;

/**
 * Created by LiuLiHao on 2019/7/29 0029 下午 09:28
 * @author : LiuLiHao
 * 描述：饲养员
 */
public class ZooKeeper implements Serializable {

    private String name;
    private int age;

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
}
