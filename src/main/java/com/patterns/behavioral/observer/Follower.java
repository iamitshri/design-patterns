package com.patterns.behavioral.observer;

public class Follower implements Observer{

    @Override
    public void update(Object newState) {
        System.out.println(newState);
    }
}
