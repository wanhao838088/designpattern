package com.wanhao.parrern.state.app;

/**
 * Created by LiuLiHao on 2019/7/27 0027 下午 12:50
 * @author : LiuLiHao
 * 描述：可以抽奖状态
 */
public class NoRaffleState extends AbstractState {

    Activity activity;

    public NoRaffleState(Activity activity){
        this.activity = activity;
    }
    @Override
    void decreaseMoney() {
        System.out.println("扣钱 50金币 ");
        //切换状态
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    boolean raffle() {
        System.out.println("不能抽奖");
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
