package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

import java.util.Locale;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("test ", text -> text + "ABC");
        poemBeautifier.beautify("Tekst na duże litery ", text -> text.toUpperCase());
        poemBeautifier.beautify("TEXT NA MALE LITERY", text -> text.toLowerCase(Locale.ROOT));
        poemBeautifier.beautify("Teraz tekst ", text -> text + "JEST PIEKNY");

    }
}