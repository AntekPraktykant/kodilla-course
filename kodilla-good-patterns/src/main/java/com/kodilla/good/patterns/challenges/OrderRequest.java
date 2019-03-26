package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderRequest {
    private Customer customer;
    private LocalDateTime localDateTime;
    private List<Product> products = new ArrayList<>();

    public OrderRequest (final Customer customer, final LocalDateTime localDateTime, final List<Product> products) {
        this.customer = customer;
        this.localDateTime = localDateTime;
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public List<Product> getProducts() {
        return products;
    }
}
