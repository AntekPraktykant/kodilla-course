package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result;

        try {
            result = firstChallenge.divide(3, 0); // why it's not possible to use this in try (result = ...)
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Do not perform division by zero ");
        } finally {
            System.out.println("Finally here!");
        }
    }
}