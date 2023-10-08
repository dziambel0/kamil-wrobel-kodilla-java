package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {
    @Bean
    public Board getBoard(){
        return new Board(getToDoList(), getProgressList(), getDoneList());
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getToDoList(){
        return new TaskList(new ArrayList<>());
    }
    @Bean(name = "progressList")
    @Scope("prototype")
    public TaskList getProgressList(){
        return new TaskList(new ArrayList<>());
    }
    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getDoneList(){
        return new TaskList(new ArrayList<>());
    }
}
