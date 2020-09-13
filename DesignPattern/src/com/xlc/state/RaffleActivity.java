package com.xlc.state;

import jdk.nashorn.internal.ir.CallNode;

public class RaffleActivity {

    //state表示当前的状态,是变化的
    private State state = null;
    //代表奖品的数量
    private int count = 0;

    //四个属性 代表四个状态
    private State noRaffleState = new NoRaffleState(this);
    private State canRaffleState = new CanRaffleState(this);
    private State dispenseOutState = new DispenseOutState(this);
    private State dispenseState = new DispenseState(this);

    //构造器
    //1.初始化当前状态为NoRaffleState即不能抽奖的状态 2.定义奖品数量
    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    //扣分,调用当前状态的deduceMoney
    public void deduceMoney(){
        state.deduceMoney();
    }

    //抽奖
    public void raffle(){
        //抽到奖品
        if (state.raffle()){
            //发放奖品
            state.dispensePrize();
        }
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    //每领取一次奖品,count--
    public int getCount() {
        int countCurrent = count;
        count --;
        return countCurrent;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }
}
