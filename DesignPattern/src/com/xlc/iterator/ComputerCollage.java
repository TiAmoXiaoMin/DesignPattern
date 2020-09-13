package com.xlc.iterator;

import java.util.Iterator;

public class ComputerCollage implements Collage {

    private Department[] departments;
    private int numOfDepartment = 0;

    public ComputerCollage(){
        departments = new Department[5];
        addDepartment("java","java");
        addDepartment("c","c");
        addDepartment("c++","c++");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
