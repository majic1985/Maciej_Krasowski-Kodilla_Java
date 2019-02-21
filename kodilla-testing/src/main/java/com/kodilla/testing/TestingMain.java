package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

            Calculator calculator = new Calculator();
        Integer addResult = calculator.add(5,5);
        Integer subResult = calculator.subtract(10,8);

        if (addResult.equals(5 + 5)){
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Error!");
        }
        if (subResult.equals(10 - 8)){
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Error!");
        }
    }
}

