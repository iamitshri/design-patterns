package com.patterns.structural.composite;

public class Supervisor implements Employee{

    final String name;

    public Supervisor(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("name: "+name);
    }
}
