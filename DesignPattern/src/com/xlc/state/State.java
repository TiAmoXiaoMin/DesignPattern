package com.xlc.state;

//状态抽象类
public abstract class State {

    //扣除50积分
    public abstract void deduceMoney();

    //是否抽中
    public abstract boolean raffle();

    //发放奖品
    public abstract void dispensePrize();

}
