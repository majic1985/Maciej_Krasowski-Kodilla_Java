package com.kodilla.exception.main;

import com.kodilla.exception.com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.com.kodilla.exception.test.SecondChallenge;

public class ExceptionModuleRunner {
    public ExceptionModuleRunner() {
    }

    public static void main(String[] args) {
        SecondChallenge checkXY = new SecondChallenge();

        try {
            System.out.println(checkXY.probablyIWillThrowException(2.0D, 1.0D));
        } catch (Exception e) {

            ExceptionHandling printOutTheRule = new ExceptionHandling();
            printOutTheRule.runExceptionhandling();

        }

    }
}

