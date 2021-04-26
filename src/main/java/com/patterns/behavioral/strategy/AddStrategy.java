package com.patterns.behavioral.strategy;

public class AddStrategy implements Strategy {

    @Override
    public int doOperation(int n1, int n2) {
        int add = n1 + n2;
        System.out.println(add);
        return add;
    }
}
