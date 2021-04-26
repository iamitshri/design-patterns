package com.patterns.creational.abstractfactory.pizzafranchise.stores;

import com.patterns.creational.abstractfactory.pizzafranchise.pizza.ChicagoStylePizza;
import com.patterns.creational.abstractfactory.pizzafranchise.pizza.Pizza;
import com.patterns.creational.abstractfactory.pizzafranchise.ingredients.Ingredients;

public class ChicagoPizzaStore extends PizzaStore {

    private final Ingredients ingredients;

    public ChicagoPizzaStore(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public Pizza createPizza(String item) {
        ChicagoStylePizza chicagoStylePizza = new ChicagoStylePizza(ingredients, item);
        chicagoStylePizza.createOne();
        System.out.println("Ready for Pickup");
        return chicagoStylePizza;
    }

}
