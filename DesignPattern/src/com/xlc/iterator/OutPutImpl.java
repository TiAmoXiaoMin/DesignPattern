package com.xlc.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {

    //学院集合
    List<Collage> collageList;

    public OutPutImpl(List<Collage> collageList) {
        this.collageList = collageList;
    }

    //遍历所有学院，然后调用printDepartment输出所有系
    public void printCollage(){
        Iterator<Collage> iterator = collageList.iterator();
        while (iterator.hasNext()){
            //取出一个学院
            Collage collage = iterator.next();
            System.out.println("====="+collage.getName() +"======");
            printDepartment(collage.createIterator()); //得到对应的迭代器
        }
    }


    //输出学院 输出系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department)iterator.next();
            System.out.println(department.getName());
        }
    }
}
