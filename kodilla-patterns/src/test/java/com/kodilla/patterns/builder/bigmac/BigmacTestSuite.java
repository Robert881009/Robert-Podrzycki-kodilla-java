package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {
    @Test
    void testNewBigmac(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.makeBun(Bun.WITH_SESAME))
                .burgers(Burgers.makeBurgers(Burgers.ONE_BURGER))
                .sauce(Sauce.makeSauce(Sauce.BARBECUE))
                .ingredient(Ingredient.makeIngredient(Ingredient.CHEESE))
                .ingredient(Ingredient.makeIngredient(Ingredient.LETTUCE))
                .build();
        System.out.println(bigmac);
        //When
        int  howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(2,howManyIngredients);
    }
}
