package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderRetrieve {

    public OrderRequest retrieve() {
        Customer customer = new Customer();
        LocalDateTime localDateTime = LocalDateTime.now();
        List<Product> someProducts = new ArrayList<>();

        return new OrderRequest(customer, localDateTime, someProducts);
    }
}
