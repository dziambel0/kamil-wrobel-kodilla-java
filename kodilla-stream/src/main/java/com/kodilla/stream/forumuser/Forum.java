package com.kodilla.stream.forumuser;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum(){
        forumUsersList.add(new ForumUser(1,"Adam",'M', LocalDate.of(2001,01,01),5 ));
        forumUsersList.add(new ForumUser(2,"Barbara",'F', LocalDate.of(2002,01,01),10 ));
        forumUsersList.add(new ForumUser(3,"Czesław",'M', LocalDate.of(2003,01,01),15 ));
        forumUsersList.add(new ForumUser(4,"Danuta",'F', LocalDate.of(2004,01,01),20 ));
        forumUsersList.add(new ForumUser(5,"Ernest",'M', LocalDate.of(2005,01,01),25 ));
        forumUsersList.add(new ForumUser(6,"Grazyna",'F', LocalDate.of(2006,01,01),30 ));
        forumUsersList.add(new ForumUser(7,"Ignacy",'M', LocalDate.of(2007,01,01),35 ));
        forumUsersList.add(new ForumUser(8,"Judyta",'F', LocalDate.of(2008,01,01),40 ));
        forumUsersList.add(new ForumUser(9,"Karol",'M', LocalDate.of(2009,01,01),45 ));
        forumUsersList.add(new ForumUser(10,"Lidia",'F', LocalDate.of(2010,01,01),50 ));
    }
    public List<ForumUser> getUserList(){
        return  new ArrayList<>(forumUsersList);
    }
}
