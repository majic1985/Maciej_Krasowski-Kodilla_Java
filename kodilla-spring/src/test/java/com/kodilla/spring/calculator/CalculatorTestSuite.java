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
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sumResult = calculator.add(6, 4);
        double subResult = calculator.sub(10,6 );
        double mulResult = calculator.mul(2, 3);
        double divResult = calculator.div(8, 2);

        //Then
        Assert.assertEquals(10,sumResult,0.01);
        Assert.assertEquals(4, subResult, 0.01);
        Assert.assertEquals(6, mulResult, 0.01);
        Assert.assertEquals(4, divResult, 0.01);
    }
}
