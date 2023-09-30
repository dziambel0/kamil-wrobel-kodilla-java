package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {
        CompanyRegistration companyRegistration = new CompanyRegistration();
        Supplier supplier = companyRegistration.registration();
        OrderService orderService = new OrderService();
        orderService.precess(supplier);
    }
}
