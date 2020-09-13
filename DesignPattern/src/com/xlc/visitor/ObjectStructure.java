package com.xlc.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {

    //维护一个集合
    private List<Person> personList = new LinkedList<>();


    //添加到personList
    public void attach(Person person){
        personList.add(person);

    }

    //移除
    public void detach(Person person){
        personList.remove(person);
    }


    //显示评测情况
    public void display(Action action){
        for(Person p:personList){
            p.accept(action);
        }
    }



}
