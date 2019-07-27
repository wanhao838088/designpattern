package com.wanhao.parrern.state.app;

/**
 * Created by LiuLiHao on 2019/7/27 0027 下午 12:50
 * @author : LiuLiHao
 * 描述：已经扣过钱了   可以抽奖状态
 */
public class CanRaffleState extends AbstractState {

    Activity activity;

    public CanRaffleState(Activity activity){
        this.activity = activity;
    }

    @Override
    void decreaseMoney() {
        System.out.println("已经扣过钱了..");
    }
    @Override
    boolean raffle() {
        int i = (int) (Math.random()*10);
        if (i==5){
            //中奖
            activity.setState(activity.getDispenseState());
            return true;
        }else {
            //没有中奖
            System.out.println("没有中奖");
            activity.setState(activity.getNoRaffleState());
        }
        return false;
    }
    @Override
    void dispensePrize() {
        System.out.println("不能发货");
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
