package com.patterns.behavioral.visitor;

public class ScrumMaster implements Employee{

    @Override
    public void accept(Visitor v) {
        System.out.println("visiting ScrumMaster ");
        v.visit(this);
    }

    @Override
    public int getSalary() {
        return 10;
    }
}
