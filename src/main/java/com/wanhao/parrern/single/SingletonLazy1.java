package com.wanhao.parrern.single;

/**
 * Created by LiuLiHao on 2019/7/23 0023 上午 09:31
 * @author : LiuLiHao
 * 描述：懒汉1
 */
public class SingletonLazy1 {
    private SingletonLazy1() {
    }

    private static  SingletonLazy1 instance;

    /**
     * 不能正常使用
     * @return
     */
    public static SingletonLazy1 getInstance() {
        if (instance==null){
            instance = new SingletonLazy1();
        }
        return instance;
    }
}
