package com.wanhao.parrern.proxy.cglib;

/**
 * Created by LiuLiHao on 2019/7/28 0028 上午 10:40
 * @author : LiuLiHao
 * 描述：测试cglib代理
 */
public class CglibTest {

    public static void main(String[] args) {
        TeacherDao instance = new ProxyFactory(new TeacherDao()).getProxyInstance();
        System.out.println(instance.getResult());

    }
}
