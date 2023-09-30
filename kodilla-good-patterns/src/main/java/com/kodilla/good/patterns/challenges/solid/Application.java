package com.kodilla.good.patterns.challenges.solid;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retriva();

        OrderProcesor orderProcesor = new OrderProcesor(new InformationService(), new OrderService());
        orderProcesor.process(orderRequest);
    }
}
