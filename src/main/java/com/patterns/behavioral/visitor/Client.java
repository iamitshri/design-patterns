package com.patterns.behavioral.visitor;

public class Client {

    public static void main(String[] args) {

        Organization organization = new Organization();
        organization.addEmployee(new Manager());
        organization.addEmployee(new Engineer());
        organization.addEmployee(new ProductManager());
        organization.addEmployee(new ScrumMaster());

        SalaryVisitor salaryVisitor = new SalaryVisitor();
        organization.accept(salaryVisitor);
        System.out.println("Organization Total salary:" + salaryVisitor.getTotal());
    }
}
