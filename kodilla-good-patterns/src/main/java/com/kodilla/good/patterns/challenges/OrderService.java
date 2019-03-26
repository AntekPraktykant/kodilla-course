package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderService {
    abstract public boolean order(Customer customer, LocalDateTime localDateTime, List<Product> products);
}
