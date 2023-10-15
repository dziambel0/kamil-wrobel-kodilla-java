package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testShopingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        boolean execute = false;
        //When
        Task shoping = factory.makeTask(TaskFactory.SHOPPING);
        shoping.executeTask();
        execute = shoping.isTaskExecuted();
        //Then
        assertEquals("Zakupy sporzywcze",shoping.getTaskName());
        assertTrue(execute);
    }
    @Test
    void testPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        boolean execute = false;
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        execute = painting.isTaskExecuted();
        //Then
        assertEquals("Malowanie mieszkanie",painting.getTaskName());
        assertTrue(execute);
    }
    @Test
    void testDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        boolean execute = false;
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        execute = driving.isTaskExecuted();
        //Then
        assertEquals("Wycieczka",driving.getTaskName());
        assertTrue(execute);
    }
}
