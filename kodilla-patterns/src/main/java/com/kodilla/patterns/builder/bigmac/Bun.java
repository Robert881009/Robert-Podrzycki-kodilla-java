package com.kodilla.patterns.builder.bigmac;

public final class Bun {
    public static final String WITH_SESAME = "With sesame";
    public static final String WITHOUT_SESAME = "Without sesame";


    public static String makeBun(String bunType){
        if (bunType.equals(WITHOUT_SESAME)){
            return WITHOUT_SESAME;
        }else if (bunType.equals(WITH_SESAME)){
            return WITH_SESAME;
        }else {
            throw  new IllegalStateException("lallalala");}
    }
}
