package com.wanhao.parrern.proxy.staticproxy;

/**
 * Created by LiuLiHao on 2019/7/27 0027 下午 08:30
 * @author : LiuLiHao
 * 描述：静态代理类
 */
public class UserDaoProxy implements UserDao{

    UserDao userDao;

    public UserDaoProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    public void work() {
        System.out.println("开始前");
        userDao.work();
        System.out.println("结束了");
    }
}
