package com.wanhao.parrern.state.app;

/**
 * Created by LiuLiHao on 2019/7/27 0027 下午 12:46
 * @author : LiuLiHao
 * 描述：state类 定义抽象方法
 */
public abstract class AbstractState {

    /**
     * 扣钱
     */
    abstract void decreaseMoney();

    /**
     * 抽奖
     * @return 返回true中奖
     */
    abstract boolean raffle();

    /**
     * 发放奖品
     */
    abstract void dispensePrize();
}
