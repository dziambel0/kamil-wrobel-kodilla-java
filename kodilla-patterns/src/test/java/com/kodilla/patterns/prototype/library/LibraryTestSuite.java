package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        Book book001 = new Book("Baśnie", "Hans Christian Andersen", LocalDate.of(1947, 01, 01));
        Book book002 = new Book("Brzechwa dzieciom", "Jan Brzechwa", LocalDate.of(2021, 01, 01));
        Book book003 = new Book("Dzieci z Bullerbyn", "Astrid Lindgren", LocalDate.of(1947, 01, 01));
        Library library = new Library("Biblioteka");
        library.books.add(book001);
        library.books.add(book002);
        library.books.add(book003);
        System.out.println("Ilosc ksiazek w bibliotece - " + library.books.size());

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println("Ilosc ksiazek w sklonowanej bibliotece - " + clonedLibrary.books.size());

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        deepClonedLibrary.books.remove(book003);
        System.out.println("Ilosc ksiazek w gleboko sklonowanej bibliotece - " + deepClonedLibrary.books.size());

        //Then
        assertEquals(3,library.books.size());
        assertEquals(3,clonedLibrary.books.size());
        assertEquals(2,deepClonedLibrary.books.size());
    }
}
