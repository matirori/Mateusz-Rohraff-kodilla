package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements BasicPizzaOrder {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getIngriedients() {
        return "Pizza dough, tomato sauce, cheese";
    }
}
