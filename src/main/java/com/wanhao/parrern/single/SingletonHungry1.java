package com.wanhao.parrern.single;

/**
 * Created by LiuLiHao on 2019/7/23 0023 上午 09:31
 * @author : LiuLiHao
 * 描述：饿汉1
 */
public class SingletonHungry1 {
    private SingletonHungry1() {
    }

    /**
     * 直接创建
     */
    private static final SingletonHungry1 instance = new SingletonHungry1();

    public static SingletonHungry1 getInstance() {
        return instance;
    }
}
