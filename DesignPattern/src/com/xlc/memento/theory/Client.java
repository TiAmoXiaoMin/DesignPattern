package com.xlc.memento.theory;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态一: 攻击100");
        //保存了当前的状态
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态二: 攻击 80");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态三: 攻击 60");
        caretaker.add(originator.saveStateMemento());

        //输出状态一
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println(originator.getState());

        //输出状态二
        originator.getStateFromMemento(caretaker.get(1));
        System.out.println(originator.getState());
    }
}
