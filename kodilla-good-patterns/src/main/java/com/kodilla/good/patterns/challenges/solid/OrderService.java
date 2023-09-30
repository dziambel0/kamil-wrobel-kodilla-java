package com.kodilla.good.patterns.challenges.solid;

public class OrderService {

    public boolean order(User user, Item item){
        System.out.println("Zamówienie uzytkownika " + user.getName() + " " + user.getSurname() + " na przedmiot " + item.getName() + " z kategorii " + item.getCategory() + " zostało zrealizowane");
        return true;
    }

}
