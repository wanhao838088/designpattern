package com.wanhao.parrern.proxy.dynamic;

/**
 * Created by LiuLiHao on 2019/7/27 0027 下午 09:28
 * @author : LiuLiHao
 * 描述：测试jdk代理
 */
public class ClientTest {

    public static void main(String[] args) {
        PersonDao personDao = (PersonDao) new ProxyFactory(new PersonDaoImpl()).getProxyInstance();

        personDao.work();

        //带参数和返回值的
        int sum = personDao.calc(10, 20);
        System.out.println(sum);
    }
}
