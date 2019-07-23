package com.wanhao.parrern.single;

/**
 * Created by LiuLiHao on 2019/7/23 0023 上午 09:31
 * @author : LiuLiHao
 * 描述：双重检查
 */
public class SingletonDoubleCheck {
    private SingletonDoubleCheck() {
    }

    private static SingletonDoubleCheck instance;

    /**
     * 不能正常使用
     * @return
     */
    public static SingletonDoubleCheck getInstance() {
        if (instance==null){
            synchronized (SingletonDoubleCheck.class){
                if (instance==null){
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }

}
