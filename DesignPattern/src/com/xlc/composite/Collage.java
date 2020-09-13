package com.xlc.composite;

import java.util.ArrayList;
import java.util.List;

public class Collage extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<>();


    public Collage(String name,String des){
        super(name,des);
    }


    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void print() {
        System.out.println("============"+ getName() +"================");
        for (OrganizationComponent o:organizationComponents
             ) {
            o.print();
        }
    }
}
