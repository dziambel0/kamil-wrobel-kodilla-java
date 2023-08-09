package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    List<Integer> lista = new ArrayList<>();
    List<Integer> parzyste = new ArrayList<>();



    public List<Integer> exterminate(List<Integer> numbers){
    this.lista = numbers;
        for (Integer pozycjeListy: numbers) {
            if(pozycjeListy%2==0){
                parzyste.add(pozycjeListy);
            }
        }
    return parzyste;


    }

}
