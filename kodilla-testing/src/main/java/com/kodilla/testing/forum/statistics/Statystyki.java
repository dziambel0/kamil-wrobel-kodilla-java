package com.kodilla.testing.forum.statistics;

public class Statystyki {

    private int liczbaUrzytkownikow;
    private int liczbaPostow;
    private int liczbaKomentarzy;
    private double sredniaLiczbaPostowNaUrzytkownika;
    private double sredniaLiczbaKomentarzyNaUrzytkownika;
    private double sredniaLiczbaKomentarzyNaPost;

    public void calculateAdvStatistics(Statistics statistics){
    liczbaKomentarzy=statistics.commentsCount();
    liczbaUrzytkownikow = statistics.usersNames().size();

    }

    public void showStatistics(){
        System.out.println(liczbaUrzytkownikow);
        System.out.println(liczbaPostow);
        System.out.println(liczbaKomentarzy);
        System.out.println(sredniaLiczbaPostowNaUrzytkownika);
        System.out.println(sredniaLiczbaKomentarzyNaUrzytkownika);
        System.out.println(sredniaLiczbaKomentarzyNaPost);
    }
}
