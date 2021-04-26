package com.patterns.behavioral.visitor;

public interface Visitor {

    void visit(Manager m);
    void visit(Engineer m);
    void visit(ProductManager m);
    void visit(ScrumMaster m);
    void visit(Organization organization);
}
