package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String tekst, PoemDecorator poemDecorator){
        System.out.println(poemDecorator.decorate(tekst));
    }

}
