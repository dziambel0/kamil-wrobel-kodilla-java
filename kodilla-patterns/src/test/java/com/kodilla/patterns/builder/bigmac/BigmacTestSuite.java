package com.kodilla.patterns.builder.bigmac;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {
    @Test
    void testBurgerBuilder(){
        //Given
        Bigmac bigmac = new Bigmac.BurgerBuilder()
                .bun(Bun.BUN_WITH_SEZAM)
                .burgers(2)
                .sauce(Sauce.STANDARD)
                .ingredients(Ingredients.ONION)
                .ingredients(Ingredients.BECON)
                .builder();
        System.out.println(bigmac);
        //When
        String bun = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce();
        List<String> ingredients = bigmac.getIngredients();
        //Then
        assertEquals("Bun with sezam", bun);
        assertEquals(2, burgers);
        assertEquals("Standard", sauce);
        assertEquals(2, ingredients.size());
    }
}
