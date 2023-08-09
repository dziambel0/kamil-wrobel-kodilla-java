package com.kodilla.testing.forum.collection;

import  com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;


public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when we send an empty list to the exterminate method, " +
            "then back list sould be empty too")

    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> numbers = new ArrayList<>();
        //When
        OddNumbersExterminator sortowanie = new OddNumbersExterminator();
        List<Integer> listaLiczbParzystych = sortowanie.exterminate(numbers);
        //Then
        if(listaLiczbParzystych.size() == 0){
            System.out.println("The list is empty");
        }else{
            System.out.println("ERROR - the list is not empty");
        }
    }

    @DisplayName("when we send a not empty list to the exterminate method, " +
            "then back list sould be only with even numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        boolean parzyste = false;
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<20; i++) {
            numbers.add(i);
        }
        //When
        OddNumbersExterminator sortowanie = new OddNumbersExterminator();
        List<Integer> listaLiczbParzystych = sortowanie.exterminate(numbers);
        //Then
        for (Integer liczbyWTablicy: listaLiczbParzystych) {
            if(liczbyWTablicy%2 == 0){
                parzyste = true;
            }else {
                parzyste = false;
            }
        }
        if(parzyste == true){
            System.out.println("On the list are only even numbers");
        }else {
            System.out.println("ERROR - On the list are not only even numbers");
        }
    }
}
