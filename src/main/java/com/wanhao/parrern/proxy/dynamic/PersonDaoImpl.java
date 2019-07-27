package com.wanhao.parrern.proxy.dynamic;

/**
 * Created by LiuLiHao on 2019/7/27 0027 下午 08:29
 * @author : LiuLiHao
 * 描述：
 */
public class PersonDaoImpl implements PersonDao {

    @Override
    public void work() {
        System.out.println("PersonDaoImpl");
    }

    @Override
    public int calc(int i, int j) {
        return i+j;
    }

}
