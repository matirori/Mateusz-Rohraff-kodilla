package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaDecorator implements BasicPizzaOrder {
    private final BasicPizzaOrder basicPizza;

    public AbstractPizzaDecorator(BasicPizzaOrder basicPizza) {
        this.basicPizza = basicPizza;
    }

    @Override
    public BigDecimal getCost() {
        return basicPizza.getCost();
    }

    @Override
    public String getIngriedients() {
        return basicPizza.getIngriedients();
    }
}
