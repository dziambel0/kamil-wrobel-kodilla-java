package com.kodilla.testing.forum.statistics;

public class Statystyki {
    private int liczbaUrzytkownikow;
    private int liczbaPostow;
    private int liczbaKomentarzy;
    private double sredniaLiczbaPostowNaUrzytkownika;
    private double sredniaLiczbaKomentarzyNaUrzytkownika;
    private double sredniaLiczbaKomentarzyNaPost;

    public void setLiczbaUrzytkownikow(int liczbaUrzytkownikow) {
        this.liczbaUrzytkownikow = liczbaUrzytkownikow;
    }

    public void setLiczbaPostow(int liczbaPostow) {
        this.liczbaPostow = liczbaPostow;
    }

    public void setLiczbaKomentarzy(int liczbaKomentarzy) {
        this.liczbaKomentarzy = liczbaKomentarzy;
    }

    public int getLiczbaUrzytkownikow() {
        return liczbaUrzytkownikow;
    }

    public int getLiczbaPostow() {
        return liczbaPostow;
    }

    public int getLiczbaKomentarzy() {
        return liczbaKomentarzy;
    }

    public double getSredniaLiczbaPostowNaUrzytkownika() {
        return sredniaLiczbaPostowNaUrzytkownika;
    }

    public double getSredniaLiczbaKomentarzyNaUrzytkownika() {
        return sredniaLiczbaKomentarzyNaUrzytkownika;
    }

    public double getSredniaLiczbaKomentarzyNaPost() {
        return sredniaLiczbaKomentarzyNaPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
    liczbaKomentarzy = statistics.commentsCount();
    liczbaUrzytkownikow = statistics.usersNames().size();
    liczbaPostow = statistics.postsCount();
    sredniaLiczbaKomentarzyNaUrzytkownika = liczbaKomentarzy / liczbaUrzytkownikow;
    sredniaLiczbaPostowNaUrzytkownika = liczbaPostow / liczbaUrzytkownikow;
    sredniaLiczbaKomentarzyNaPost = liczbaKomentarzy / liczbaPostow;
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
