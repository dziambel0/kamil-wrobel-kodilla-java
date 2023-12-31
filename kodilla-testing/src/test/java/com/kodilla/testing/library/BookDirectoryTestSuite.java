package com.kodilla.testing.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("title"+n, "author" +n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test
    void testListBooksWithConditionsReturnList() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());

    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testlistBooksInHandsOf0Books(){
        LibraryUser libraryUser = new LibraryUser("test", "test2", "test3");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(List.of());
        List<Book> bookList = bookLibrary.listBooksInHandsOf(libraryUser);
        Assertions.assertEquals(bookList.size(), 0);
    }

    @Test
    void testlistBooksInHandsOf1Books(){
        LibraryUser libraryUser = new LibraryUser("test", "test2", "test3");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOfBooks = new ArrayList<>();
        Book book1 = new Book("title1","author1", 2000);
        listOfBooks.add(book1);
        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(listOfBooks);
        List<Book> bookList = bookLibrary.listBooksInHandsOf(libraryUser);
        Assertions.assertEquals(bookList.size(), 1);
    }

    @Test
    void testlistBooksInHandsOf5Books(){
        LibraryUser libraryUser = new LibraryUser("test", "test2", "test3");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOfBooks = new ArrayList<>();
        Book book1 = new Book("title1","author1", 2000);
        Book book2 = new Book("title2","author2", 2000);
        Book book3 = new Book("title3","author3", 2000);
        Book book4 = new Book("title4","author4", 2000);
        Book book5 = new Book("title5","author5", 2000);
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        listOfBooks.add(book5);
        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(listOfBooks);
        List<Book> bookList = bookLibrary.listBooksInHandsOf(libraryUser);
        Assertions.assertEquals(bookList.size(), 5);
    }

}