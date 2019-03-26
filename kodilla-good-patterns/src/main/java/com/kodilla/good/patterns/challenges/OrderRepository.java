package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository {
    public boolean createOrder(Customer customer, LocalDateTime localDateTime, List<Product> products);
}
