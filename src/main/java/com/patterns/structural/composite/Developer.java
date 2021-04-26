package com.patterns.structural.composite;

public class Developer implements Employee{

    final String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("name: "+name);
    }
}
