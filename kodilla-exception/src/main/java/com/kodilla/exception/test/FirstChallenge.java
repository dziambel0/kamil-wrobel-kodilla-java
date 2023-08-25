package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        try {
            return a / b;
        } catch (ArithmeticException e){
           throw  new ArithmeticException ("Nie dzieli sie przez 0");
        } finally {
            System.out.println("Działanie zostalo wykonane");
        }
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}