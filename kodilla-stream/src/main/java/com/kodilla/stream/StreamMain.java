package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

import java.time.LocalDate;


public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() > 2003)
                .filter(forumUser -> forumUser.getPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getId, ForumUser -> ForumUser));

        System.out.println(mapOfUsers.size());
        mapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);



    }
}