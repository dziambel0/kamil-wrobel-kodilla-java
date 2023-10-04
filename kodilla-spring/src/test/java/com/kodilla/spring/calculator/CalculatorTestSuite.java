package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTestSuite {
    @Test
    void testCalculationsAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double value = calculator.add(2,2);
        //Then
        assertEquals(4, value );
    }
    @Test
    void testCalculationsSub(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double value = calculator.sub(2,2);
        //Then
        assertEquals(0, value );
    }
    @Test
    void testCalculationsMul(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double value = calculator.mul(2,2);
        //Then
        assertEquals(4, value );
    }
    @Test
    void testCalculationsDiv(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double value = calculator.div(2,2);
        //Then
        assertEquals(1, value );
    }
}
