package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {


    @Test
    void testGetAverage(){
        //Given
        ArrayOperations arrayOp = new ArrayOperations();
        OptionalDouble average;
        int[] tablica = new int[20];
        for (int i=0; i<tablica.length; i++){
            tablica[i] = i;
        }
        //When
        average = arrayOp.getAverage(tablica);
        OptionalDouble averageExpected = OptionalDouble.of(9.5);
        //Then
        Assertions.assertEquals(averageExpected, average);
    }
}

