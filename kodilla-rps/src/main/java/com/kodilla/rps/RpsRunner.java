package com.kodilla.rps;
import java.util.Scanner;
public class RpsRunner {

    public static void main(String[] args) {

        int koniecGry = 0;
        Game game = new Game();

        while (koniecGry == 0){
            game.nowaGra();
            game.wlasciwosciGry();
            game.instrukcja();
            while (game.getCarrentRound() <= game.getRounds()){
                game.runda();
                game.sprawdzanieWyniku();
            }
            System.out.println("-------------------------------");
            game.wygrana();
            System.out.println("\n");
            koniecGry = game.menu();
        }

    }
}
