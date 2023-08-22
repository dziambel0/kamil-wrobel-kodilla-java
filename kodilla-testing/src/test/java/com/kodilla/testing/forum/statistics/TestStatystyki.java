
package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@DisplayName("TDD: Forum Statistic Test Suite")
class TestStatystyki {
    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }


    private Statistics statisticsMock = Mockito.mock(Statistics.class);

    @Test
    void testCalculateAdvStatistics0Posts() {
        //Given
        Statystyki statystyki = new Statystyki();
        List<String> lista = new ArrayList<>();
        for(int i=0; i<100; i++){
            lista.add("User" + i);
        }

        //When
        when(statisticsMock.usersNames()).thenReturn(lista);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(0);
        statystyki.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, statystyki.getSredniaLiczbaPostowNaUrzytkownika());
        Assertions.assertEquals(0, statystyki.getSredniaLiczbaKomentarzyNaPost());
        Assertions.assertEquals(0.5, statystyki.getSredniaLiczbaKomentarzyNaUrzytkownika());
    }
    @Test
    void testCalculateAdvStatistics1000Posts() {
        //Given
        Statystyki statystyki = new Statystyki();
        List<String> lista = new ArrayList<>();
        for(int i=0; i<100; i++){
            lista.add("User" + i);
        }

        //When
        when(statisticsMock.usersNames()).thenReturn(lista);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(1000);
        statystyki.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(10, statystyki.getSredniaLiczbaPostowNaUrzytkownika());
        Assertions.assertEquals(0.05, statystyki.getSredniaLiczbaKomentarzyNaPost());
        Assertions.assertEquals(0.5, statystyki.getSredniaLiczbaKomentarzyNaUrzytkownika());

    }
    @Test
    void testCalculateAdvStatistics0Urzytkownikow() {
        //Given
        Statystyki statystyki = new Statystyki();
        List<String> lista = new ArrayList<>();

        //When
        when(statisticsMock.usersNames()).thenReturn(lista);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(1000);
        statystyki.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, statystyki.getSredniaLiczbaPostowNaUrzytkownika());
        Assertions.assertEquals(0.05, statystyki.getSredniaLiczbaKomentarzyNaPost());
        Assertions.assertEquals(0, statystyki.getSredniaLiczbaKomentarzyNaUrzytkownika());

    }
    @Test
    void testCalculateAdvStatistics1000Urzytkownikow() {
        //Given
        Statystyki statystyki = new Statystyki();
        List<String> lista = new ArrayList<>();
        for(int i=0; i<1000; i++){
            lista.add("User" + i);
        }

        //When
        when(statisticsMock.usersNames()).thenReturn(lista);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(1000);
        statystyki.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(1, statystyki.getSredniaLiczbaPostowNaUrzytkownika());
        Assertions.assertEquals(0.05, statystyki.getSredniaLiczbaKomentarzyNaPost());
        Assertions.assertEquals(0.05, statystyki.getSredniaLiczbaKomentarzyNaUrzytkownika());

    }
    @Test
    void testCalculateAdvStatistics0Komentarzy() {
        //Given
        Statystyki statystyki = new Statystyki();
        List<String> lista = new ArrayList<>();
        for(int i=0; i<1000; i++){
            lista.add("User" + i);
        }

        //When
        when(statisticsMock.usersNames()).thenReturn(lista);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        statystyki.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(1, statystyki.getSredniaLiczbaPostowNaUrzytkownika());
        Assertions.assertEquals(0, statystyki.getSredniaLiczbaKomentarzyNaPost());
        Assertions.assertEquals(0, statystyki.getSredniaLiczbaKomentarzyNaUrzytkownika());

    }
    @Test
    void testCalculateAdvStatisticsKomentarzeMniejszeNizPost() {
        //Given
        Statystyki statystyki = new Statystyki();
        List<String> lista = new ArrayList<>();
        for(int i=0; i<1000; i++){
            lista.add("User" + i);
        }

        //When
        when(statisticsMock.usersNames()).thenReturn(lista);
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.postsCount()).thenReturn(1000);
        statystyki.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(1, statystyki.getSredniaLiczbaPostowNaUrzytkownika());
        Assertions.assertEquals(0.2, statystyki.getSredniaLiczbaKomentarzyNaPost());
        Assertions.assertEquals(0.2, statystyki.getSredniaLiczbaKomentarzyNaUrzytkownika());

    }
    @Test
    void testCalculateAdvStatisticsKomentarzeWiekszeNizPost() {
        //Given
        Statystyki statystyki = new Statystyki();
        List<String> lista = new ArrayList<>();
        for(int i=0; i<1000; i++){
            lista.add("User" + i);
        }

        //When
        when(statisticsMock.usersNames()).thenReturn(lista);
        when(statisticsMock.commentsCount()).thenReturn(1500);
        when(statisticsMock.postsCount()).thenReturn(1000);
        statystyki.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(1, statystyki.getSredniaLiczbaPostowNaUrzytkownika());
        Assertions.assertEquals(1.5, statystyki.getSredniaLiczbaKomentarzyNaPost());
        Assertions.assertEquals(1.5, statystyki.getSredniaLiczbaKomentarzyNaUrzytkownika());

    }
}