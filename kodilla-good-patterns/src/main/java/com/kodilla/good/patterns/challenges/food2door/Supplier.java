package com.kodilla.good.patterns.challenges.food2door;

public class Supplier {

private FoodSupplier foodSupplier;
private String typeofFoor;
private int quantity;

    public Supplier(FoodSupplier foodSupplier, String typeofFoor, int quantity) {
        this.foodSupplier = foodSupplier;
        this.typeofFoor = typeofFoor;
        this.quantity = quantity;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    public String getTypeofFoor() {
        return typeofFoor;
    }

    public int getQuantity() {
        return quantity;
    }
}
