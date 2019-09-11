package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiDecorator extends AbstractPizzaDecorator {
    public SalamiDecorator(BasicPizzaOrder basicPizza) {
        super(basicPizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getIngriedients() {
        return super.getIngriedients() + " extra salami";
    }
}
