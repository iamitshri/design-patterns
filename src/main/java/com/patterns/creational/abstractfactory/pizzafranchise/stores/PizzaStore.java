package com.patterns.creational.abstractfactory.pizzafranchise.stores;

import com.patterns.creational.abstractfactory.pizzafranchise.pizza.Pizza;

public abstract class PizzaStore {

     public abstract Pizza createPizza(String item);
}
