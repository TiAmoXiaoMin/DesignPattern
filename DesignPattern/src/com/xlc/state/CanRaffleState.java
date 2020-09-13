package com.xlc.state;

import java.util.Random;

//抽奖状态
public class CanRaffleState extends State{


    private RaffleActivity raffleActivity;

    public CanRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    //已经扣除了积分,不能再扣除积分
    @Override
    public void deduceMoney() {
        System.out.println("已经扣除过积分了");
    }

    //可以抽奖 开始抽奖 抽完奖后改为新的状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖: 请稍等! ");
        Random random = new Random();
        int i = random.nextInt(10);
        //抽中奖品
        if(i == 0){
            raffleActivity.setState(raffleActivity.getDispenseState());
            return true;
        }else {
            System.out.println("很遗憾你没有中奖");
            //改变状态为不能抽奖
            raffleActivity.setState(raffleActivity.getNoRaffleState());
            return false;
        }

    }

    //当前状态不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("很遗憾,不能发放奖品");
    }
}
