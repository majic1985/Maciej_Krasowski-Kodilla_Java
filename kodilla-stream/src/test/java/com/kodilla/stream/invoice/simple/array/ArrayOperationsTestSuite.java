package com.kodilla.stream.invoice.simple.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArrayOperationsTestSuite implements ArrayOperations {
    public ArrayOperationsTestSuite() {
    }

    @Test
    public void testGetAverage() {
        int[] numbers = new int[20];
        Random rnd = new Random();

        int sum;
        for(sum = 0; sum < 20; ++sum) {
            numbers[sum] = rnd.nextInt(1000);
        }

        sum = 0;

        for(int i = 0; i < 20; ++i) {
            sum += numbers[i];
        }

        double expectedAverage = (double)sum / 20.0D;
        Assert.assertEquals(expectedAverage, ArrayOperations.getAverage(numbers), 1.0E-6D);
    }
}


