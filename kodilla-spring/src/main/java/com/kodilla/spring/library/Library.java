package com.kodilla.spring.library;

import java.util.ArrayList;
import java.util.List;

public final class Library {
    private final List<String > books = new ArrayList<>();

    public Library (final LibraryDbController libraryDbController){
        this.libraryDbController = libraryDbController;
    }

    public Library(){

    }

    private LibraryDbController libraryDbController;

    public void saveDatabase(){
        libraryDbController.saveData();
    }
    public void loadDatabase(){
        libraryDbController.loadData();
    }
}
