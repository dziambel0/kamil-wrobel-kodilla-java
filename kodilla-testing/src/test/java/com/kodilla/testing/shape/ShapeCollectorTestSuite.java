package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Test Suite")
class ShapeTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    void testAddFigure() {
        //Given
        ShapeCollector listaFigur = new ShapeCollector();
        //When
        Square kwadrat = new Square(5);
        listaFigur.addFigure(kwadrat);
        //Then
        Assertions.assertEquals(1, listaFigur.listaFigur.size());
    }
    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector listaFigur = new ShapeCollector();
        //When
        Square kwadrat = new Square(5);
        listaFigur.listaFigur.add(kwadrat);
        listaFigur.removeFigure(kwadrat);
        //Then
        Assertions.assertEquals(0, listaFigur.listaFigur.size());
    }
    @Test
    void testGetFigure() {
        //Given
        ShapeCollector listaFigur = new ShapeCollector();
        //When
        Square kwadrat = new Square(5);
        listaFigur.listaFigur.add(kwadrat);
        //Then
        Assertions.assertEquals(listaFigur.listaFigur.get(0), listaFigur.getFigure(0));
    }
    @Test
    void testShowFigures() {
        //Given
        ShapeCollector listaFigur = new ShapeCollector();
        //When
        Square kwadrat = new Square(5);
        listaFigur.listaFigur.add(kwadrat);
        listaFigur.listaFigur.add(kwadrat);
        //Then
        Assertions.assertEquals(listaFigur.listaFigur, listaFigur.showFigures());
    }
}
