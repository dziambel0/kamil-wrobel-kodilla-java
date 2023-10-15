package com.kodilla.patterns.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeFactoryTestSuite {
    @Test
    void testFactoryCircle(){
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape circle = factory.makeShape(ShapeFactory.CIRCLE);
        //Then
        assertEquals(Math.pow(4.5,2)*Math.PI, circle.getArea(),0);
        assertEquals("Circle001", circle.getName());
    }
    @Test
    void testFactorySquare(){
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape square = factory.makeShape(ShapeFactory.SQUARE);
        //Then
        assertEquals(49, square.getArea(),0);
        assertEquals("Square001", square.getName());
    }
    @Test
    void testFactoryRectangle(){
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape rectangle = factory.makeShape(ShapeFactory.RECTANGLE);
        //Then
        assertEquals(37.5, rectangle.getArea(),0);
        assertEquals("Rectangle", rectangle.getName());
    }
}
