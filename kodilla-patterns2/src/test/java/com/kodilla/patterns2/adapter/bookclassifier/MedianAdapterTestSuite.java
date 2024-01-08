package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        BookA bookA1 = new BookA("Author1", "Tytul1", 2000, "Signature1");
        BookA bookA2 = new BookA("Author1", "Title2", 1990, "Signature2");
        BookA bookA3 = new BookA("Author3", "Title3", 2002, "Signature3");
        Set<BookA> setBook = new HashSet<>();
        setBook.add(bookA1);
        setBook.add(bookA2);
        setBook.add(bookA3);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(setBook);
        //Then
        System.out.println(median);
        assertEquals(2000, median);
    }
}
