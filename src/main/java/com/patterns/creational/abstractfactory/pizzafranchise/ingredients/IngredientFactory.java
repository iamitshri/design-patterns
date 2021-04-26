package com.patterns.creational.abstractfactory.pizzafranchise.ingredients;

import java.util.ArrayList;
import java.util.List;

public class IngredientFactory implements Ingredients {

    String dough;
    String sauce;
    String cheese;
    List<String> veggies;
    List<String> meatOptions;

    public IngredientFactory(Builder builder) {
        this.sauce = builder.sauce;
        this.dough = builder.dough;
        this.cheese = builder.cheese;
        this.veggies = builder.veggies;
        this.meatOptions = builder.meatOptions;
    }

    @Override
    public String createDough() {
        return this.dough;
    }

    @Override
    public String createSauce() {
        return this.sauce;
    }

    @Override
    public String createCheese() {
        return this.cheese;
    }

    @Override
    public List<String> createVeggies() {

        return this.veggies;
    }

    @Override
    public List<String> meatOptions() {
        return this.meatOptions;
    }

    public static class Builder {

        public List<String> veggies = new ArrayList<>();
        public List<String> meatOptions = new ArrayList<>();
        private String dough;
        private String sauce;
        private String cheese;

        public Builder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder setCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder addVeggie(String v) {
            veggies.add(v);
            return this;
        }

        public Builder addMeatOption(String m) {
            meatOptions.add(m);
            return this;
        }

        public IngredientFactory createIngredientFactory() {
            return new IngredientFactory(this);
        }
    }
}
