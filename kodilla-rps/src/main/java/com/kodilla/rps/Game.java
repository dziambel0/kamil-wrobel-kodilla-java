package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    private int rounds;

    private int carrentRound;
    private int userPoints;
    private int komputerPoints;

    private int wyborGracza;
    private int wyborKomputera;

    private String name;

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getRounds() {
        return rounds;
    }

    public int getCarrentRound() {
        return carrentRound;
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public int menu(){
        int wynik = 0;
        String wczytywanie;
        System.out.println("NOWA GRA - n");
        System.out.println("KONIEC GRY - x");
        wczytywanie = scanner.next();

        if(wczytywanie.equals("n") || wczytywanie.equals("N")){
            wynik = 0;
        } else if (wczytywanie.equals("x") || wczytywanie.equals("X")) {
            wynik = 1;
        }else{
            System.out.println("Zła komenda");
        }
        return wynik;
    }

    public void nowaGra(){
        carrentRound = 1;
        userPoints = 0;
        komputerPoints = 0;
    }

    public void instrukcja(){
        System.out.println("\nInstrukcja:\n\n1 - PAPIER\n2 - KAMIEN\n3 - NORZYCZKI");
        System.out.println("n - NOWA GRA\nx - KONIEC GRY");
    }

    public void wlasciwosciGry(){
        System.out.println("\nWitam w grze KAMIEN - PAPIER - NORZYCZKI");
        System.out.println("\nWpisz swoje Imię");
        name = scanner.next();
        System.out.println(name + " podaj ilość rund do rozegrania");
        String testRounds = scanner.next();
        while (isNumeric(testRounds) == false){
            System.out.println("Wpisz cyfre");
            testRounds = scanner.next();
        }
        rounds = Integer.parseInt(testRounds);
        carrentRound = 1;
    }

    public String zamianaNaNapis(int a){
        String napis = null;
        if (a == 1){
            napis = "Papier";
        } else if (a == 2) {
            napis = "Kamien";
        } else if (a == 3) {
            napis = "Norzyczki";
        }
        return napis;
    }

    public static boolean isOnetoThree(String str) {
            if(str.equals("1") || str.equals("2") || str.equals("3")) {
                return true;
            } else
                return false;
        }

    public void runda(){
        System.out.println("\nRUNDA " + carrentRound + "/" + rounds);
        System.out.println("Wpisz co wybierasz: 1 - PAPIER, 2 - KAMIEN, 3 - NORZYCZKI");
        String testWyborGracza = scanner.next();
        while(isNumeric(testWyborGracza) == false || isOnetoThree(testWyborGracza) == false){
            System.out.println("Wpisana wartość musi być cyfrą od 1 do 3");
            testWyborGracza = scanner.next();
        }
        wyborGracza = Integer.parseInt(testWyborGracza);
        wyborKomputera = random.nextInt(3) + 1;
        System.out.println("POJEDYNEK: " + zamianaNaNapis(wyborGracza) + "-" + zamianaNaNapis(wyborKomputera) + ".");
        carrentRound++;
    }

    public void sprawdzanieWyniku(){
        if(wyborGracza == 1 && wyborKomputera == 1){
            System.out.println("Remis nikt nie dostaje punktu");
        } else if (wyborGracza == 1 && wyborKomputera == 2) {
            System.out.println("Rundę wygrywa " + name);
            userPoints ++;
        } else if (wyborGracza == 1 && wyborKomputera == 3) {
            System.out.println("Runde wygrywa komputer");
            komputerPoints++;
        } else if (wyborGracza == 2 && wyborKomputera == 1) {
            System.out.println("Runde wygrywa komputer");
            komputerPoints++;
        } else if (wyborGracza == 2 && wyborKomputera == 2) {
            System.out.println("Remis nikt nie dostaje punktu");
        } else if (wyborGracza == 2 && wyborKomputera == 3) {
            System.out.println("Runde wygrywa " + name);
            userPoints++;
        } else if (wyborGracza == 3 && wyborKomputera == 1) {
            System.out.println("Runde wygrywa " + name);
            userPoints++;
        } else if (wyborGracza == 3 && wyborKomputera == 2) {
            System.out.println("Rudne wygrywa komputer");
            komputerPoints++;
        } else if (wyborGracza == 3 && wyborKomputera == 3) {
            System.out.println("Remis nikt nie dostaje punktu");
        }
        System.out.println("Gracz: " + userPoints);
        System.out.println("Komputer: " + komputerPoints);
    }

    public void wygrana(){
        if(userPoints > komputerPoints){
            System.out.println("Gre wygrywa " + name);
        } else if (userPoints < komputerPoints) {
            System.out.println("Gre wygrywa komputer");
        } else if (userPoints == komputerPoints) {
            System.out.println("Remis");
        }
    }

}
