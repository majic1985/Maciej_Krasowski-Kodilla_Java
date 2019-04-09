package com.kodilla.exception.com.kodilla.exception.test;

public class FirstChallenge {
    public double divide( double a, double b ) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main( String[] args ) {
        try {
            FirstChallenge firstChallenge = new FirstChallenge();
            double result = firstChallenge.divide(3.0D, 0.0D);
            System.out.println(result);
        } catch (ArithmeticException var7) {
            System.out.println("unable to divide by 0! ..machine says: " + var7);
        } finally {
            System.out.println("the end.");

        }
    }
}

