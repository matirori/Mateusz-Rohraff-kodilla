package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OlivesDecorator extends AbstractPizzaDecorator {
    public OlivesDecorator(BasicPizzaOrder basicPizza) {
        super(basicPizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getIngriedients() {
        return super.getIngriedients() + " extra olives";
    }
}
