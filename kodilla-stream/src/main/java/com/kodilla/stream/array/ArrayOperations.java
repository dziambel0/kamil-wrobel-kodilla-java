package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperations {

    public OptionalDouble getAverage(int[] numbers){

        OptionalDouble average;
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();

        return average;
    }
}
