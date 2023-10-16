package com.kodilla.patterns.builder.pizza;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaTestSuice {
    @Test
    void testPizzaNew(){
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .bottom("thin")
                .sauce("spicy")
                .ingredient("Onion")
                .ingredient("Mashrooms")
                .ingredient("Ham")
                .build();
        System.out.println(pizza);
        //When
        int howManyIngrediens = pizza.getIngredients().size();
        //Then
        assertEquals(3,howManyIngrediens);
    }
}
