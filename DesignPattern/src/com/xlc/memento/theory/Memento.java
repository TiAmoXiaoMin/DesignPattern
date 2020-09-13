package com.xlc.memento.theory;

public class Memento {


    private String state; //状态信息

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }


}
