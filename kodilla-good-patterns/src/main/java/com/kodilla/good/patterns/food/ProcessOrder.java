package com.kodilla.good.patterns.food;

public class ProcessOrder {

    private boolean isPayed;
    private OrderDto order;

    public ProcessOrder(User user, Supplier supplier, OrderRequest order) {

        this.order = prepareOrder(order);
        this.isPayed = VerifyPayment.verify(user);

        if(isPayed) {
            supplier.processOrder(this.order);
            supplier.deliver(this.order);
        } else {
            System.out.println("This transaction can not be completed because payment has failed");
        }
    }

    public OrderDto prepareOrder(OrderRequest or) {
        /*Some preprocessing for different suppliers*/
        return new OrderDto();
    }
}
