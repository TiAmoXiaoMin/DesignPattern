package com.xlc.memento.game;

public class GameRole {

    //攻击力
    private int vit;

    //防御力
    private int def;

    //创建Memento,即根据当前的状态得到Memento
    public Memento crateMemento(){
        return new Memento(vit,def);
    }

    //从备忘录对象,恢复GameRole状态
    public void recoverGameRoleFromMemento(Memento memento){
        this.def = memento.getDef();
        this.vit = memento.getVit();
    }

    //显示游戏的状态
    public void display(){
        System.out.println("攻击力"+vit);
        System.out.println("防御力"+def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
