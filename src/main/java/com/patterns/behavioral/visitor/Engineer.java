package com.patterns.behavioral.visitor;

public class Engineer implements Employee {

    @Override
    public void accept(Visitor v) {
        System.out.println("visiting Engineer ");
        v.visit(this);
    }

    @Override
    public int getSalary() {
        return 10;
    }
}
