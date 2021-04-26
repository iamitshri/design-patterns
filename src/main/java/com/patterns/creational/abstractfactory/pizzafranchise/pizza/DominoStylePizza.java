package com.patterns.creational.abstractfactory.pizzafranchise.pizza;

import com.patterns.creational.abstractfactory.pizzafranchise.ingredients.Ingredients;

public class DominoStylePizza extends Pizza {

    Ingredients ingredients;

    public DominoStylePizza(Ingredients ingredients,String name) {
        this.ingredients = ingredients;
        this.name=name;
    }

    @Override
    public void prepare() {
        this.dough = ingredients.createDough();
        this.sauce = ingredients.createSauce();
        this.cheese = ingredients.createCheese();
        this.veggies = ingredients.createVeggies();
        this.meatOptions = ingredients.meatOptions();
    }
}
