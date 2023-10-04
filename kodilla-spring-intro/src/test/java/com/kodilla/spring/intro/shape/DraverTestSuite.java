package com.kodilla.spring.intro.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DraverTestSuite {
    @Test
    void testDoDrawingWithCircle(){
        //Given
        Circle circle = new Circle();
        Drawer drawer = new Drawer(circle);
        //When
        String result = drawer.doDrowing();
        //Then
        assertEquals("This is Circle", result);
    }
    @Test
    void testDoDrowingWithTriangle(){
        //Given
        Triangle triangle = new Triangle();
        Drawer drawer = new Drawer(triangle);
        //When
        String result = drawer.doDrowing();
        //Then
        assertEquals("This is Triangle", result);
    }
}
