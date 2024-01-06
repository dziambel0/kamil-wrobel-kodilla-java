package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getPizzaCost();
        //Then
        assertEquals(new BigDecimal(27), calculatedCost);
    }
    @Test
    public void testPizzaDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        //When
        String description = theOrder.getPizzaDescription();
        //Then
        assertEquals("Ciasto z sosem i serem + extra cheese + ham + mushrooms", description);
    }
}
