package com.patterns.structural.bridge;

public class CorolaLAsiaPacific extends AbstractCorolaImpl{

    @Override
    void listSafeteyRating() {
        System.out.println("Not so safe.");
    }

    @Override
    boolean isCarRightHanded() {
        System.out.println("True");
        return true;
    }
}
