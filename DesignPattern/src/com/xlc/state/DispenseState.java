package com.xlc.state;

/**
 * 发放奖品的状态
 */
public class DispenseState extends State{

    private RaffleActivity raffleActivity;

    public DispenseState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    //扣除积分状态
    @Override
    public void deduceMoney() {
        System.out.println("不能扣除积分");
    }

    //不能抽奖状态
    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }


    //发放奖品
    @Override
    public void dispensePrize() {
        if(raffleActivity.getCount() > 0){
            System.out.println("恭喜你中奖了");
            //改变为不能抽奖状态
            raffleActivity.setState(raffleActivity.getNoRaffleState());
        }else {
            System.out.println("很遗憾,奖品发放完了");
            //改变为奖品发放完的状态 后面就不可以再抽奖了
            //raffleActivity.setState(raffleActivity.getDispenseOutState());
            System.out.println("抽奖结束");
            System.exit(0);
        }

    }
}
