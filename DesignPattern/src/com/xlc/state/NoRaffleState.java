package com.xlc.state;

/**
 * 不能抽奖状态
 */
public class NoRaffleState extends State {


    //初始化活动引用
    private RaffleActivity raffleActivity;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    //当前状态可以扣除积分,扣除后,设置成抽奖模式
    @Override
    public void deduceMoney() {
        System.out.println("扣除50积分,可以抽奖了");
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    //当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖");
        return false;
    }

    //当前状态不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
