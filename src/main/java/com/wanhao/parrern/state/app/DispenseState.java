package com.wanhao.parrern.state.app;

/**
 * Created by LiuLiHao on 2019/7/27 0027 下午 12:50
 * @author : LiuLiHao
 * 描述：中奖发货状态
 */
public class DispenseState extends AbstractState {

    Activity activity;

    public DispenseState(Activity activity){
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
        //判断库存进行发货
        if(activity.getCount()>0){
            //发货了
            System.out.println("发奖");
            activity.setState(activity.getNoRaffleState());
        }else {
            //没奖品了
            System.out.println("没有奖品了");
            activity.setState(activity.getDispenseOutState());
        }
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
