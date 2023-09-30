package com.kodilla.good.patterns.challenges.food2door;

public class OrderService {
    public void precess(Supplier supplier){
        System.out.println("Zlecenie zakupu od dostawcy: " + supplier.getFoodSupplier().getNameOfCompany() + " na " + supplier.getTypeofFoor() + " zostało zrealizowane.");
    }
}
