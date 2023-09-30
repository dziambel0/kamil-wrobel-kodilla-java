package com.kodilla.good.patterns.challenges.food2door;

public class FoodSupplier {

    private String nameOfCompany;
    private String addres;

    public FoodSupplier(String nameOfCompany, String addres) {
        this.nameOfCompany = nameOfCompany;
        this.addres = addres;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public String getAddres() {
        return addres;
    }
}
