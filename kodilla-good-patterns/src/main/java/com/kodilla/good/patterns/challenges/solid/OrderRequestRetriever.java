package com.kodilla.good.patterns.challenges.solid;

public class OrderRequestRetriever {

    public OrderRequest retriva(){
        User user = new User("John", "Smith","Jonny");
        Item item = new Item("The Last of Us", "Gry", 10);

        return new OrderRequest(user, item);
    }

}
