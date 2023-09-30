package com.kodilla.good.patterns.challenges.solid;

public class OrderDTO {

    private User user;
    private Item item;
    boolean isOrder;

    public OrderDTO(final User user, final Item item, final boolean isOrder) {
        this.user = user;
        this.item = item;
        this.isOrder = isOrder;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
