package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {

    private Customer customer;
    private List<Product> products = new ArrayList<>();

    public OrderDto(final Customer customer, final Product product) {
        this.customer = customer;
        this.products.add(product);
    }

    public Customer getCustomer() {return customer; }
    public List<Product> getProducts() {return products;}
}
