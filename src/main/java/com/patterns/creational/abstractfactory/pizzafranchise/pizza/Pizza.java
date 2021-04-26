package com.patterns.creational.abstractfactory.pizzafranchise.pizza;

import java.util.List;

public abstract class Pizza {

    String dough;
    String sauce;
    String cheese;
    List<String> veggies;
    List<String> meatOptions;

    String name;

    /**
     * Prepare method is Pizza specific
     */
    abstract public void prepare();

    public void bake() {
        System.out.println("baking pizza wait for 15minutes");
    }


    public void packageIt() {
        System.out.println("Cutting and packing pizza. Ready in 5 minutes");
    }


    public void createOne() {
        System.out.println();
        System.out.println("Getting ready to make pizza: " + name);
        prepare();

        System.out.println("Preparing dough: " + dough + "...");
        System.out.println("Adding sauce:" + sauce + "...");
        System.out.println("Adding cheese:" + cheese + "...");
        for (String v : veggies) {
            System.out.println("Adding veggie:" + v + "...");
        }
        for (String m : meatOptions) {
            System.out.println("Adding meat:" + m + "...");
        }
        bake();
        packageIt();
    }
}
