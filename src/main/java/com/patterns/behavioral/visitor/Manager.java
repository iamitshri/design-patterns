package com.patterns.behavioral.visitor;

public class Manager implements Employee{

    @Override
    public void accept(Visitor v) {
        System.out.println("visiting Manager ");
        v.visit(this);
    }
    @Override
    public int getSalary() {
        return 13;
    }
}
