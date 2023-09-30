package com.kodilla.good.patterns.challenges.solid;

public class OrderRequest {

private User user;
private Item item;

    public OrderRequest(final User user, final Item item) {
        this.user = user;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }
}
