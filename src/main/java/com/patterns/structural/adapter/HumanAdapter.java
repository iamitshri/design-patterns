package com.patterns.structural.adapter;

public class HumanAdapter implements Bird{

    private final Human human;

    public HumanAdapter(Human human) {
        this.human = human;
    }

    @Override
    public void fly() {
        human.jump();
    }
}
