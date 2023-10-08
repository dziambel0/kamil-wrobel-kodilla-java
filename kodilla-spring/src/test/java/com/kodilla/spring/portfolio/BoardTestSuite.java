package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = context.getBean(Board.class);
        board.toDoList.tasks.add("Zadanie do zrobienia 0128");
        board.toDoList.tasks.add("Zadanie do zrobienia 0234");
        board.inProgressList.tasks.add("Zadanie w trakcie robienia 0038");
        board.inProgressList.tasks.add("Zadanie w trakcie robienia 0048");
        board.doneList.tasks.add("Zadanie zrobione 0001");
        board.doneList.tasks.add("Zadanie zrobione 0005");

        //Then
        System.out.println("Lista zadan do zrobienia: " + board.toDoList.tasks);
        System.out.println("Lista zadan w trakcie wykonywania: " + board.inProgressList.tasks);
        System.out.println("Lista zadan wykonanych: " + board.doneList.tasks);
    }
}
