package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(2,2);
        } catch (Exception e){
            System.out.println("Zostal wyrzucony blad");
        }finally {
            System.out.println("Metoda sie wykonala");
        }
    }
}
