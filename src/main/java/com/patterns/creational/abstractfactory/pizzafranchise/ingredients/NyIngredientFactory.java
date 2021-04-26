package com.patterns.creational.abstractfactory.pizzafranchise.ingredients;

import java.util.ArrayList;
import java.util.List;

public class NyIngredientFactory implements Ingredients {

    @Override
    public String createDough() {
        return "ny dough";
    }

    @Override
    public String createSauce() {
        return "ny sauce";
    }

    @Override
    public String createCheese() {
        return "ny cheese";
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
