package com.wanhao.parrern.single;

/**
 * Created by LiuLiHao on 2019/7/23 0023 上午 09:31
 * @author : LiuLiHao
 * 描述：饿汉1
 */
public class SingletonHungry2 {
    private SingletonHungry2() {
    }

    /**
     * 在静态代码块创建
     */
    private static SingletonHungry2 instance;

    static {
        instance = new SingletonHungry2();
    }

    public static SingletonHungry2 getInstance() {
        return instance;
    }
}
