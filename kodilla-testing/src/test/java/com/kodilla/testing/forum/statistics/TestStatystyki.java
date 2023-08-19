package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.Statystyki;
import org.junit.jupiter.api.*;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
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

    @Mock
    private Statistics statisticsMock;
    @Test
    void testCalculateAdvStatistics0Posts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(List.of());

        //When


        //Then

    }
    @Test
    void testCalculateAdvStatistics1000Posts() {
        //Given


        //When


        //Then

    }
    @Test
    void testCalculateAdvStatistics0Urzytkownikow() {
        //Given


        //When


        //Then

    }
    @Test
    void testCalculateAdvStatistics1000Urzytkownikow() {
        //Given


        //When


        //Then

    }
    @Test
    void testCalculateAdvStatistics0Komentarzy() {
        //Given


        //When


        //Then

    }
    @Test
    void testCalculateAdvStatisticsKomentarzeMniejszeNizPost() {
        //Given


        //When


        //Then

    }
    @Test
    void testCalculateAdvStatisticsKomentarzeWiekszeNizPost() {
        //Given


        //When


        //Then

    }
}
