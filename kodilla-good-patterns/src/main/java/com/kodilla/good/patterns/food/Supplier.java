package com.kodilla.good.patterns.food;

import java.util.List;
import java.util.Map;

public interface Supplier {

    public boolean processOrder(OrderDto order);
    public boolean deliver(OrderDto order);
    public Map<Integer, String> getMenu();
}
