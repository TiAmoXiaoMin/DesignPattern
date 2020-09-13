package com.xlc.state;

/**
 * 奖品发送完状态
 * 当我们raffleActivity改变为这个DispenseOutState状态时,抽奖结束
 */
public class DispenseOutState extends State{

    private RaffleActivity raffleActivity;

    public DispenseOutState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("奖品发送完了,请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了,请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了,请下次再参加");



    }
}
