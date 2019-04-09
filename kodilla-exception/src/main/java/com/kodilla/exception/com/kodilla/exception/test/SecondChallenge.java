package com.kodilla.exception.com.kodilla.exception.test;

public class SecondChallenge {

    public SecondChallenge() {
    }

    public String probablyIWillThrowException(double x, double y) throws Exception {
        if (x < 2.0D && x >= 1.0D && y != 1.5D) {
            return "Done!";
        } else {
            throw new Exception();
        }
    }
}
