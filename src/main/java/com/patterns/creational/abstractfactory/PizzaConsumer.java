package com.patterns.creational.abstractfactory;

import com.patterns.creational.abstractfactory.pizzafranchise.ingredients.IngredientFactory;
import com.patterns.creational.abstractfactory.pizzafranchise.stores.ChicagoPizzaStore;
import com.patterns.creational.abstractfactory.pizzafranchise.stores.NyPizzaStore;
import com.patterns.creational.abstractfactory.pizzafranchise.stores.PizzaStore;
import com.patterns.creational.abstractfactory.pizzafranchise.stores.PizzaStores;

public class PizzaConsumer {

    public static void main(String[] args) {

        // Ingredients are products. We create family of products using Abstract Factory Ingredients
        // Each subclass
        IngredientFactory.Builder builder = new IngredientFactory.Builder();
        builder.setCheese("Chicago-cheese");
        builder.setDough("Chicago-dough");
        builder.setSauce("Chicago-sauce");
        builder.addVeggie("Chicago-tomato");
        builder.addVeggie("Chicago-pineapple");
        builder.addMeatOption("Chicago-ham");
        builder.addMeatOption("Chicago-chicken");
        IngredientFactory chicagoIngredientFactory = builder.createIngredientFactory();
        PizzaStores.add("chicago", new ChicagoPizzaStore(chicagoIngredientFactory));

        builder = new IngredientFactory.Builder();
        builder.setCheese("Ny-cheese");
        builder.setDough("Ny-dough");
        builder.setSauce("Ny-sauce");
        builder.addVeggie("Ny-tomato");
        builder.addVeggie("Ny-pineapple");
        builder.addMeatOption("Ny-ham");
        builder.addMeatOption("Ny-chicken");
        IngredientFactory nyIngredientFactory = builder.createIngredientFactory();
        PizzaStores.add("ny", new NyPizzaStore(nyIngredientFactory));

        PizzaStore chicagoPizzaStore = PizzaStores.get("chicago");
        chicagoPizzaStore.createPizza("cheese-double");

        PizzaStore nyPizzaStore = PizzaStores.get("ny");
        nyPizzaStore.createPizza("special-on-menu");
    }

}
