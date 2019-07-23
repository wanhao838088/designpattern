package com.wanhao.parrern.single;

/**
 * Created by LiuLiHao on 2019/7/23 0023 上午 09:31
 * @author : LiuLiHao
 * 描述：懒汉2
 */
public class SingletonLazy2 {
    private SingletonLazy2() {
    }

    private static SingletonLazy2 instance;

    /**
     * 同步锁
     * @return
     */
    public static synchronized SingletonLazy2 getInstance() {
        if (instance==null){
            instance = new SingletonLazy2();
        }
        return instance;
    }
}
