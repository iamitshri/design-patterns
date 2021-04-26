package com.patterns.structural.decorator;

public class Presentor implements Presentation{

    @Override
    public void present() {
        System.out.println("show slides and talk about facts");
    }
}
