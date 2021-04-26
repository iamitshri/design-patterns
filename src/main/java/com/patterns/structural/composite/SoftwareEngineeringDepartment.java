package com.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class SoftwareEngineeringDepartment implements Employee {

    List<Employee> employees = new ArrayList<>();

    @Override
    public void printName() {
        employees.forEach(Employee::printName);
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }
}
