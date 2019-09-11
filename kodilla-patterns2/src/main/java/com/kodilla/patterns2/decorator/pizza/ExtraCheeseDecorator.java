package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExtraCheeseDecorator extends AbstractPizzaDecorator {

    public ExtraCheeseDecorator(BasicPizzaOrder basicPizza) {
        super(basicPizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getIngriedients() {
        return super.getIngriedients() + " extra cheese";
    }
}
