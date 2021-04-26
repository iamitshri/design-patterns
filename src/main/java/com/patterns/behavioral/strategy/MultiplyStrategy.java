package com.patterns.behavioral.strategy;

public class MultiplyStrategy implements Strategy {

    @Override
    public int doOperation(int n1, int n2) {
        int mult = n1 * n2;
        System.out.println(mult);
        return mult;
    }
}
