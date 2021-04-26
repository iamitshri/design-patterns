package com.patterns.behavioral.memento;

public class Game {

    public int getInternalNum() {
        return internalNum;
    }

    public void setInternalNum(int internalNum) {
        this.internalNum = internalNum;
    }

    private int internalNum;

    Game(int state) {
        this.internalNum = state;
    }

    Object getCurrentState() {
        return internalNum;
    }

    void restoreState(Object state) {
        this.internalNum = (int) state;
    }

    void displayState(){
        System.out.println("state:"+ internalNum);
    }

}
