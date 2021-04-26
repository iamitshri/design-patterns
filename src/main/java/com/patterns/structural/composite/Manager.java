package com.patterns.structural.composite;

public class Manager implements Employee{

    final String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("name: "+name);
    }
}
