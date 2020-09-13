package com.xlc.state;

public class Client {
    public static void main(String[] args) {

        //创建活动对象,奖品池中有一个奖品
        RaffleActivity raffleActivity = new RaffleActivity(1);

        for (int i = 0; i < 30; i++) {
            System.out.println("----------------第"+(i+1)+"次抽奖---------------");
            //参加抽奖,第一步 点击扣除积分
            raffleActivity.deduceMoney();

            //第二步 抽奖
            raffleActivity.raffle();

        }

    }
}
