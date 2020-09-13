package com.xlc.iterator;

import java.util.Iterator;

public interface Collage {

    public String getName();

    //增加系的新的方法
    public void addDepartment(String name,String desc);


    //返回一个迭代器,遍历
    public Iterator createIterator();

}
