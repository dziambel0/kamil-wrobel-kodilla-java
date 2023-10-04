package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class LibraryTestSuite {

    @Test
    void testLoadFromDb() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);

        //When
        library.loadDatabase();

        //Then
        //do nothing
    }

    @Test
    void testSaveToDb() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);

        //When
        library.saveDatabase();

        //Then
        //do nothing
    }
}