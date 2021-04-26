package com.patterns.creational.abstractfactory.pizzafranchise.stores;

import com.patterns.creational.abstractfactory.pizzafranchise.pizza.NyStylePizza;
import com.patterns.creational.abstractfactory.pizzafranchise.pizza.Pizza;
import com.patterns.creational.abstractfactory.pizzafranchise.ingredients.Ingredients;

public class NyPizzaStore extends PizzaStore {

    private final Ingredients ingredients;

    public NyPizzaStore(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public Pizza createPizza(String type) {
        // create various pizza based on type
        NyStylePizza nyStylePizza = new NyStylePizza(ingredients,type);
        nyStylePizza.createOne();
        return nyStylePizza;
    }
}
