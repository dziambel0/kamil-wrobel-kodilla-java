package com.kodilla.good.patterns.challenges.food2door;

public class CompanyRegistration {

    public Supplier registration(){
        String typeOfFood = "Potatos";
        int quantity = 1000;
        FoodSupplier foodSupplier = new FoodSupplier("Super Potatos", "Warszawa, ul.Nowa2");

        return new Supplier(foodSupplier, typeOfFood, quantity);
    }


}
