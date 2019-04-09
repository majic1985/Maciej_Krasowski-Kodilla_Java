package com.kodilla.exception.com.kodilla.exception.test;

public class ExceptionHandling {
    public ExceptionHandling() {
    }

    public void runExceptionhandling() {
        SecondChallenge checkXY = new SecondChallenge();

        try {
            System.out.println(checkXY.probablyIWillThrowException(2.0D, 1.0D));
        } catch (Exception e) {
            System.out.println("Coded-in rules for arguments: x >= 2 or x < 1 or y == 1.5. Try again!");
        } finally {
            System.out.println("the end.");
        }

    }
}
