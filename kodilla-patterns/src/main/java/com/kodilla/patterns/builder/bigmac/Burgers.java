package com.kodilla.patterns.builder.bigmac;

public final class Burgers {
    public static final String ONE_BURGER = "One burger";
    public static final String TWO_BURGERS = "Two burgers";

    public static String makeBurgers(String burgersType){
    if (burgersType.equals(ONE_BURGER)){
        return ONE_BURGER;
    }else if (burgersType.equals(TWO_BURGERS)){
        return TWO_BURGERS;
    }else throw new IllegalStateException("lalalaallala");
    }
}
