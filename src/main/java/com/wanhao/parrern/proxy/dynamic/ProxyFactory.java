package com.wanhao.parrern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * Created by LiuLiHao on 2019/7/27 0027 下午 09:24
 * @author : LiuLiHao
 * 描述：动态代理
 */
public class ProxyFactory {

    PersonDao personDao;

    public ProxyFactory(PersonDao personDao) {
        this.personDao = personDao;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(personDao.getClass().getClassLoader(),
                personDao.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("进入代理");
                    return method.invoke(personDao, args);
                });
    }
}
