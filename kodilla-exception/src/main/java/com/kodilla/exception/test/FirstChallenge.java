package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {
        double d=0;
        try {
            return a / b;
        } catch (ArithmeticException e){
            System.out.println("Nie dzieli sie przez 0");
        } finally {
            System.out.println("Działanie zostalo wykonane");
        }
        return d;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(10, 0);

        System.out.println(result);
    }
}