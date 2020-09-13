package com.xlc.responsibilitychain;

public class Client {

    public static void main(String[] args) {

        //创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1,115000,1);

        //创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("徐主任");
        CollegeApprover collegeApprover = new CollegeApprover("徐院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("徐副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("徐校长");

        //需要将各个审批级别的下一个设置好(处理人构成环形)
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        //调用
        departmentApprover.processRequest(purchaseRequest);

       // schoolMasterApprover.processRequest(purchaseRequest);
    }
}
