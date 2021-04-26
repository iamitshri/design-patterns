package com.patterns.structural.bridge;

public class CorolaLNorthAmerica extends AbstractCorolaImpl {

    @Override
    void listSafeteyRating() {
        System.out.println("Highest safety.");
    }

    @Override
    boolean isCarRightHanded() {
        System.out.println("False");
        return false;
    }
}
