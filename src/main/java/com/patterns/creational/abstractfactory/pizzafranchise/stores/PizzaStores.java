package com.patterns.creational.abstractfactory.pizzafranchise.stores;

import com.patterns.creational.abstractfactory.pizzafranchise.ingredients.NyIngredientFactory;
import java.util.HashMap;
import java.util.Map;

public class PizzaStores {

    private PizzaStores() {
    }

    // Register stores
    private static final Map<String, PizzaStore> storeHashMap = new HashMap<>();

    // default
    private static NyIngredientFactory ingredientFactory = new NyIngredientFactory();
    private static PizzaStore defaultStore = new NyPizzaStore(ingredientFactory);

    public static PizzaStore get(String storeName) {
        return storeHashMap.getOrDefault(storeName, defaultStore);
    }

    public static void add(String storeName, PizzaStore store) {
        storeHashMap.put(storeName, store);
    }

}
