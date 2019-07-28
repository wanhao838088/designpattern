package com.wanhao.parrern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by LiuLiHao on 2019/7/28 0028 上午 10:36
 * @author : LiuLiHao
 * 描述：代理类
 */
public class ProxyFactory implements MethodInterceptor {
    private TeacherDao teacherDao;

    public ProxyFactory(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    /**
     * 返回代理对象
     * @return
     */
    public TeacherDao getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(teacherDao.getClass());
        enhancer.setCallback(this);
        TeacherDao ins = (TeacherDao) enhancer.create();
        return ins;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 代理 ");
        return method.invoke(teacherDao,objects);
    }
}
