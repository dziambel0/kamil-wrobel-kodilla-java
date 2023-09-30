package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(int a, int b) {
        double d=0;
        try {
            return a / b;
        } catch (RuntimeException e){
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