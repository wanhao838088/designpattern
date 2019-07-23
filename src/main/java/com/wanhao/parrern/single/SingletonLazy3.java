package com.wanhao.parrern.single;

/**
 * Created by LiuLiHao on 2019/7/23 0023 上午 09:31
 * @author : LiuLiHao
 * 描述：懒汉3
 */
public class SingletonLazy3 {
    private SingletonLazy3() {
    }

    private static SingletonLazy3 instance;

    /**
     * 不能正常使用
     * @return
     */
    public static SingletonLazy3 getInstance() {
        if (instance==null){
            synchronized (SingletonLazy3.class){
                instance = new SingletonLazy3();
            }
        }
        return instance;
    }
}
