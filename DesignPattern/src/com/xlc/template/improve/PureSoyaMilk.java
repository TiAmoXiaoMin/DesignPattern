package com.xlc.template.improve;

//原味豆浆
public class PureSoyaMilk extends SoyaMilk {

    @Override
    public void addCondiments() {

    }

    @Override
    public boolean customerWantCondiments() {
        return false;
    }
}
