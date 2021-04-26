package com.patterns.creational.abstractfactory.pizzafranchise.ingredients;

import java.util.List;

/**
 * Abstract factory : we need to create family of products.
 * Subclass implements the ingredients using its suppliers
 */
public interface Ingredients {

    String createDough();
    String createSauce();
    String createCheese();
    List<String> createVeggies();
    List<String> meatOptions();
}
