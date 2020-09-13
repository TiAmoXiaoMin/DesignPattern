package com.xlc.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {
    private List<Department> departmentList;
    private int index = -1; //索引

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判段list集合中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if(index >= departmentList.size() -1){
            return false;
        }else {
            index += 1;
            return true;
        }

    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    public void remove(){

    }
}
