package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;
@Component
public class ForumUser {

    private String name;

    public ForumUser() {
        this.name = "John Smith";
    }
    public String getName(){
        return name;
    }

}
