package com.kodilla.patterns.builder.bigmac;

public class Ingredient {
    public static final String LETTUCE = "Lettuce";
    public static final String CUCUMBER = "Cucumber";
    public static final String ONION = "Onion";
    public static final String BACON = "Bacon";
    public static final String CHAMPIGNONS = "Champignons";
    public static final String CHEESE = "Cheese";

    public static String makeIngredient(String ingredientType){
        switch (ingredientType){
            case LETTUCE:
                return LETTUCE;
            case CUCUMBER:
                return CUCUMBER;
            case ONION:
                return ONION;
            case BACON:
                return BACON;
            case CHAMPIGNONS:
                return CHAMPIGNONS;
            case CHEESE:
                return CHEESE;
            default:
                return "Nie ma takiego dodatku";
        }
    }
}
