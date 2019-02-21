package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: BEGIN");
    }

    @After
    public void after() {
        System.out.println("Test Case: END");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> even = new ArrayList<Integer>();
            Random theGenerator = new Random();
            for (int n = 0; n < 30; n++) {
            even.add(theGenerator.nextInt(20));
            oddNumbersExterminator.exterminate(even);
            System.out.println("The normal list testing: " + even);
        }

    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

            numbers.clear();
            System.out.println("Testing list: List is empty " + numbers);
        }

    }
