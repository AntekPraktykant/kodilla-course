package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isPayed = orderService.order(orderRequest.getCustomer(), orderRequest.getLocalDateTime(),
                orderRequest.getProducts());
        Product p = new Product() {
        };
        if(isPayed) {
            informationService.inform(orderRequest.getCustomer());
            orderRepository.createOrder(orderRequest.getCustomer(), orderRequest.getLocalDateTime(), orderRequest.getProducts());
            return new OrderDto(orderRequest.getCustomer(), p);
        } else {
            return new OrderDto(orderRequest.getCustomer(), p);
        }
    }
}
