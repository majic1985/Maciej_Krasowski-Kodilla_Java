package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

            Calculator calculator = new Calculator();
        Integer result = calculator.add(5,5);
        Integer result1 = calculator.substract(10,8);

        if (result.equals(5 + 5)){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        if (result1.equals(10 - 8)){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}

