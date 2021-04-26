package com.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Organization {

    List<Employee> employees;

    public Organization() {
        this.employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    public Iterator<Employee> getIterator() {
        return employees.iterator();
    }

    void accept(Visitor visitor){
        Iterator<Employee> iterator = this.getIterator();

        while (iterator.hasNext()) {
            iterator.next()
                    .accept(visitor);
        }
        visitor.visit(this);
    }

}
