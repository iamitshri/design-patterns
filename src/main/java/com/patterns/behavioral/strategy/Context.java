package com.patterns.behavioral.strategy;

public class Context {

    Strategy strategy;

    void execute(int n1, int n2) {
        strategy.doOperation(n1, n2);
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
