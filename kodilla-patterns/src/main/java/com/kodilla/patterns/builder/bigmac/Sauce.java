package com.kodilla.patterns.builder.bigmac;

public final class Sauce {
    public static final String STANDARD = "Standard";
    public static final String BARBECUE = "Barbecue";

    public static String makeSauce(String sauceType){
        if (sauceType.equals(STANDARD)){
            return STANDARD;
        }else if (sauceType.equals(BARBECUE)){
            return BARBECUE;
        }else throw new IllegalStateException("lalallala");
    }
}
