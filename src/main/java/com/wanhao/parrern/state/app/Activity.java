package com.wanhao.parrern.state.app;

/**
 * Created by LiuLiHao on 2019/7/27 0027 下午 12:51
 * @author : LiuLiHao
 * 描述： context类 集中了各种状态类
 */
public class Activity {

    private NoRaffleState noRaffleState = new NoRaffleState(this);
    private CanRaffleState canRaffleState = new CanRaffleState(this);
    private DispenseState dispenseState = new DispenseState(this);
    private DispenseOutState dispenseOutState = new DispenseOutState(this);
    int count = 0;

    private AbstractState state = null;

    /**
     * 初始化奖品数量
     * @param count
     */
    public Activity(int count){
        this.count = count;
        //设置为不能抽奖状态
        state = noRaffleState;
    }


    /**
     * 扣钱
     */
    public void decreaseMoney(){
        state.decreaseMoney();
    }

    /**
     * 抽奖
     */
    public void raffle(){
        boolean b = state.raffle();
        if (b){
            //发货
            state.dispensePrize();
        }
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public NoRaffleState getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(NoRaffleState noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public CanRaffleState getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(CanRaffleState canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(DispenseState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public DispenseOutState getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(DispenseOutState dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

    public int getCount() {
        int cur = this.count;
        count--;
        return cur;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
