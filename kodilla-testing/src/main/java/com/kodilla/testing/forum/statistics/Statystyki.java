
package com.kodilla.testing.forum.statistics;

public class Statystyki {
    private double liczbaUrzytkownikow;
    private double liczbaPostow;
    private double liczbaKomentarzy;
    private double sredniaLiczbaPostowNaUrzytkownika;
    private double sredniaLiczbaKomentarzyNaUrzytkownika;
    private double sredniaLiczbaKomentarzyNaPost;

    public double getLiczbaUrzytkownikow() {
        return liczbaUrzytkownikow;
    }

    public double getLiczbaPostow() {
        return liczbaPostow;
    }

    public double getLiczbaKomentarzy() {
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
        if (liczbaUrzytkownikow == 0){
            sredniaLiczbaKomentarzyNaUrzytkownika = 0;
            sredniaLiczbaPostowNaUrzytkownika = 0;
        }else {
            sredniaLiczbaKomentarzyNaUrzytkownika = liczbaKomentarzy / liczbaUrzytkownikow;
            sredniaLiczbaPostowNaUrzytkownika = liczbaPostow / liczbaUrzytkownikow;
        }
        if (liczbaPostow == 0){
            sredniaLiczbaKomentarzyNaPost = 0;
        }else {
            sredniaLiczbaKomentarzyNaPost = liczbaKomentarzy / liczbaPostow;
        }
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
