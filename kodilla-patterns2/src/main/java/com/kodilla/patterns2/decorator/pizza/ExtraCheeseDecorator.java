package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseDecorator extends AbstractPizzaOrderDecorator{
    public ExtraCheeseDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getPizzaCost(){
        return super.getPizzaCost().add(new BigDecimal(5));
    }
    @Override
    public String getPizzaDescription(){
        return super.getPizzaDescription() + " + extra cheese";
    }
}
