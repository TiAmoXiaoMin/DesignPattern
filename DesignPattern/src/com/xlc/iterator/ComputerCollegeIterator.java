package com.xlc.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    private Department[] departments;
    private int position = 0; //遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }


    //判断是否有下一个元素
    @Override
    public boolean hasNext() {

        if(position >= departments.length || departments[position] == null){
            return false;
        }else {
            return true;
        }

    }


    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    //删除的方法，默认空实现
    public void remove(){

    }
}
