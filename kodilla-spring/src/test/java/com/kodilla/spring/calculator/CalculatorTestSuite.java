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
        Calculator calc = context.getBean(Calculator.class);
        //When
        double add = calc.add(2, 3);
        double sub = calc.sub(20.5, 3.5);
        double mul = calc.mul(2, 3.0);
        double div = calc.div(6, 3);
        //Then
        Assert.assertEquals(5.0, add, 0);
        Assert.assertEquals(17.0, sub, 0);
        Assert.assertEquals(6.0, mul, 0);
        Assert.assertEquals(2.0, div, 0);
    }
}
