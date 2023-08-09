package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator kalkulator = new Calculator();
        if (kalkulator.add(5,2)==7){
            System.out.println("Test dodawania przebiegł poprawnie");
        }else{
            System.out.println("Pojawił się error podczas testu dodawania");
        }

        if (kalkulator.subtract(5,2)==3){
            System.out.println("Test odejmowania przebiegł poprawnie");
        }else{
            System.out.println("Pojawił się error podczas testu odejmowania");
        }

;
    }
}
