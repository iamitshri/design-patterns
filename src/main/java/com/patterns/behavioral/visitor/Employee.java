package com.patterns.behavioral.visitor;

public interface Employee {

    void accept(Visitor v);

    int getSalary();
}
