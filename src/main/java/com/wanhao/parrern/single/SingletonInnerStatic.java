package com.wanhao.parrern.single;

/**
 * Created by LiuLiHao on 2019/7/23 0023 上午 09:31
 * @author : LiuLiHao
 * 描述：静态内部类
 */
public class SingletonInnerStatic {
    private SingletonInnerStatic() {
    }

    /**
     * 静态内部类 随着类的加载而创建
     */
    static class Holder{
        private static SingletonInnerStatic instance = new SingletonInnerStatic();
    }

    public SingletonInnerStatic getInstance(){
        return Holder.instance;
    }
}
