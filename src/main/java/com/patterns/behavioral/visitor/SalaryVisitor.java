package com.patterns.behavioral.visitor;

public class SalaryVisitor implements Visitor {

    private int total = 0;

    @Override
    public void visit(Manager m) {
        total += m.getSalary();
    }

    @Override
    public void visit(Engineer m) {
        total += m.getSalary();
    }

    @Override
    public void visit(ProductManager m) {
        total += m.getSalary();
    }

    @Override
    public void visit(ScrumMaster m) {
        total += m.getSalary();
    }

    @Override
    public void visit(Organization organization) {

    }

    int getTotal() {
        return total;
    }
}
