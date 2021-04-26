package com.patterns.behavioral.visitor;

public class ProductManager implements Employee{

    @Override
    public void accept(Visitor v) {
        System.out.println("visiting ProductManager");
        v.visit(this);
    }

    @Override
    public int getSalary() {
        return 11;
    }
}
