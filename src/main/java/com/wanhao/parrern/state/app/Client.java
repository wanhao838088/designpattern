package com.wanhao.parrern.state.app;

/**
 * Created by LiuLiHao on 2019/7/27 0027 下午 01:02
 * @author : LiuLiHao
 * 描述：
 */
public class Client {

    public static void main(String[] args) {
        Activity activity = new Activity(2);
        for (int i = 0; i < 30; i++) {
            activity.decreaseMoney();
            activity.raffle();
        }
    }
}
