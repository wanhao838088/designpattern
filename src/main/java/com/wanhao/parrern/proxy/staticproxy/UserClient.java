package com.wanhao.parrern.proxy.staticproxy;

/**
 * Created by LiuLiHao on 2019/7/27 0027 下午 08:31
 * @author : LiuLiHao
 * 描述：调用端
 */
public class UserClient {

    public static void main(String[] args) {
        UserDaoProxy proxy = new UserDaoProxy(new UserDaoImpl());
        proxy.work();
    }
}
