package com.patterns.structural.composite;

public class Client {

    public static void main(String[] args) {
        Developer d1 = new Developer("A");
        Developer d2 = new Developer("B");

        Manager m1 = new Manager("M1");
        Manager m2 = new Manager("M2");

        Supervisor s1 = new Supervisor("s1");
        Supervisor s2 = new Supervisor("s2");

        SoftwareEngineeringDepartment department = new SoftwareEngineeringDepartment();
        department.addEmployee(d1);
        department.addEmployee(d2);
        department.addEmployee(m1);
        department.addEmployee(m2);
        department.addEmployee(s1);
        department.addEmployee(s2);
        department.printName();
    }
}
