package com.kodilla.patterns.builder.bigmac;

public class IngredientsFactory {
    public static final String SALAD = "SALAD";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCOMBER = "CUCOMBER";
    public static final String CHILLIPEPPER = "CHILLIPEPPER";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String SHRIMP = "SHRIMP";
    public static final String CHEESE = "CHEESE";

    public static final Ingredient makeIngredient(final String ingredient) {
        switch (ingredient) {
            case SALAD:
                return new Ingredient("Salad");
            case ONION:
                return new Ingredient("Onion");
            case BACON:
                return new Ingredient("Bacon");
            case CUCOMBER:
                return new Ingredient("Cucomber");
            case CHILLIPEPPER:
                return new Ingredient("Chilli Pepper");
            case MUSHROOMS:
                return new Ingredient("Muschroom");
            case SHRIMP:
                return new Ingredient("Shrimp");
            case CHEESE:
                return new Ingredient("Cheese");
            default:
                return null;
        }
    }
}
