package com.patterns.behavioral.observer;

public class Client {

    public static void main(String[] args) {
        Follower f1 = new Follower();
        Follower f2 = new Follower();
        Follower f3 = new Follower();

        Celebrity celebrity = new Celebrity();
        celebrity.addObserver(f1);
        celebrity.addObserver(f2);
        celebrity.addObserver(f3);

        celebrity.notifyObservers();
    }
}
