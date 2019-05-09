package com.kodilla.patterns.singleton.builder.pizza.bigmac;

import com.kodilla.patterns.builder.pizza.bigmac.BigMac;
import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacBuilder() {

            //Given
            BigMac bigMac = new BigMac.BigMacBuilder()
                    .bun("Sesame")
                    .sauce("Mayonnaise")
                    .burgers(2)
                    .ingredients("Lettuce")
                    .ingredients("Onion")
                    .ingredients("Pickle")
                    .ingredients("Cheese")
                    .ingredients("Bacon")
                    .build();

            //When
            System.out.println(bigMac);

            //Then
            Assert.assertEquals(5, bigMac.getIngredients().size());
    }
}
