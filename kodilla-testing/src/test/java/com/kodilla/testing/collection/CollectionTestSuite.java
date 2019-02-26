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
        OddNumbersExterminator odd = new OddNumbersExterminator();
        ArrayList<Integer> even = new ArrayList<Integer>();
            Random theGenerator = new Random();
            for (int n = 0; n < 100; n++) {
            even.add(theGenerator.nextInt(80));
            System.out.println("The normal list testing: " + odd.exterminate(even));
        }
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator odd = new OddNumbersExterminator();
        ArrayList<Integer> even = new ArrayList<Integer>();
        if (even .isEmpty()){
            System.out.println("Testing list: Error list is empty" );
            }else{
            System.out.println("Testing list: " + odd.exterminate(even));
            }
       }
    }
