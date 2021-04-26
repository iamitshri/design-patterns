package com.patterns.behavioral.memento;

public class Client {

    public static void main(String[] args) {

        Game g = new Game(12);
        Object state1 = g.getCurrentState();
        g.setInternalNum(1234);
        g.displayState();
        g.restoreState(state1);
        g.displayState();
    }
}
