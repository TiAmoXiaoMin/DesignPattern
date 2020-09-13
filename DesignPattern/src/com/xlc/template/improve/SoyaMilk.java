package com.xlc.template.improve;

//抽象类 表示豆浆
public abstract class SoyaMilk {

    //模板方法 可以使用final,不让子类去覆盖
    public final void make(){
        select();
        if(customerWantCondiments()){
            addCondiments();
        }
        soak();
        beat();
    }

    //选择材料
    public void select(){
        System.out.println("第一步: 选择上好的豆浆");
    }

    //添加不同的配料
    public abstract void addCondiments();

    //浸泡
    public void soak(){
        System.out.println("第三步:黄豆和配料浸泡三小时");
    }

    //制作
    public void beat(){
        System.out.println("第四步: 使用豆浆机打碎制作");
    }


    public boolean customerWantCondiments(){

        return true;
    }














}
