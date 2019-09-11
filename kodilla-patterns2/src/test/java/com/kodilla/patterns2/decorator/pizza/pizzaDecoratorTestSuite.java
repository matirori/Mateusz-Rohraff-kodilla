package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class pizzaDecoratorTestSuite {
    @Test
    public void pizzaWithEverything() {

        //Given
        BasicPizzaOrder basicPizzaOrder = new BasicPizza();
        basicPizzaOrder = new SalamiDecorator(basicPizzaOrder);
        basicPizzaOrder = new ExtraCheeseDecorator(basicPizzaOrder);
        basicPizzaOrder = new OlivesDecorator(basicPizzaOrder);

        //When
        BigDecimal cost = basicPizzaOrder.getCost();
        String ingriedients = basicPizzaOrder.getIngriedients();

        //Then
        assertEquals("Pizza dough, tomato sauce, cheese extra salami extra cheese extra olives", ingriedients);
        assertEquals(new BigDecimal(25), cost);
    }
}
