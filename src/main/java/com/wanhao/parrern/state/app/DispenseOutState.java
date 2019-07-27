package com.wanhao.parrern.state.app;

/**
 * Created by LiuLiHao on 2019/7/27 0027 下午 12:50
 * @author : LiuLiHao
 * 描述：奖品发放没了状态
 */
public class DispenseOutState extends AbstractState {

    Activity activity;

    public DispenseOutState(Activity activity){
        this.activity = activity;
    }

    @Override
    void decreaseMoney() {
        System.out.println("已经扣过钱了..");
    }
    @Override
    boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }
    @Override
    void dispensePrize() {
        System.out.println("奖品已经发完了");
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
