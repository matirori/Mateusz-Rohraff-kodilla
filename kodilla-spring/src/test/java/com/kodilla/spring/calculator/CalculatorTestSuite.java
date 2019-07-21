package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sumResult = calculator.add(2,1);
        double subResult = calculator.sub(2,1);
        double mulResult = calculator.mul(2,1);
        double divResult = calculator.div(2,1);
        //Then
        Assert.assertEquals(new Display().displayValue(3), sumResult, 0);
        Assert.assertEquals(new Display().displayValue(1), subResult, 0);
        Assert.assertEquals(new Display().displayValue(2), mulResult, 0);
        Assert.assertEquals(new Display().displayValue(2), divResult, 0);
    }
}
