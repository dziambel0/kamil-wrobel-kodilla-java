package com.kodilla.good.patterns.challenges.solid;

public class OrderProcesor {

    private InformationService informationService;
    private OrderService orderService;

    public OrderProcesor(final InformationService informationService, final OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }

    public OrderDTO process(OrderRequest orderRequest){
        boolean isOrder = orderService.order(orderRequest.getUser(),orderRequest.getItem());
        if(isOrder){
            informationService.sendEmail();
            return new OrderDTO(orderRequest.getUser(),orderRequest.getItem(), true);
        }else {
            return new OrderDTO(orderRequest.getUser(),orderRequest.getItem(), false);
        }
    }

}
