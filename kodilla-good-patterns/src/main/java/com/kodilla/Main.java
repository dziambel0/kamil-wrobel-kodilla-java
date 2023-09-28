package com.kodilla;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        Map <String, List<String>> booksTitlesWithTranslations = movieStore.getMovies();
                booksTitlesWithTranslations.values().stream()
                .flatMap(list->list.stream())
                .map(allList->allList + "!")
                .forEach(System.out::print);





    }
}