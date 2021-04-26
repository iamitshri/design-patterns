package com.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Celebrity implements Subject {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update("change"));
    }
}
