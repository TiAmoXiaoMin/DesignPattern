package com.xlc.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollage implements Collage {

    private List<Department> departmentList;

    public InfoCollage(){
        departmentList = new ArrayList<>();
        addDepartment("信息技术","信息技术");
        addDepartment("信息技术","信息技术");
        addDepartment("信息技术","信息技术");
    }

    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
