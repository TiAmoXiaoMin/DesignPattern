package com.xlc.memento.game;

public class Client {
    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();
        GameRole gameRole= new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        Memento memento = gameRole.crateMemento();
        System.out.println("跟boss打之前");
        gameRole.display();
        caretaker.setMemento(memento);
        System.out.println("跟boss打之后");
        gameRole.setDef(90);
        gameRole.setVit(90);
        gameRole.display();
        System.out.println("跟boss打打完");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.display();
    }
}
