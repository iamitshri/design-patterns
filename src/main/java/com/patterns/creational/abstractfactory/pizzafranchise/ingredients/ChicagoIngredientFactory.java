package com.patterns.creational.abstractfactory.pizzafranchise.ingredients;

import java.util.ArrayList;
import java.util.List;

public class ChicagoIngredientFactory implements Ingredients {

    @Override
    public String createDough() {
        return "chicago dough";
    }

    @Override
    public String createSauce() {
        return "chicago sauce";
    }

    @Override
    public String createCheese() {
        return "chicago cheese";
    }

    @Override
    public List<String> createVeggies() {
        var veggies = new ArrayList<String>();
        veggies.add("tomato");
        return veggies;
    }

    @Override
    public List<String> meatOptions() {
        var meatOptions = new ArrayList<String>();
        meatOptions.add("pepperoni");
        return meatOptions;
    }
}
