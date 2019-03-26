package com.kodilla.good.patterns.food;

import java.util.Map;

public class ExtraFoodShop implements Supplier{

    @Override
    public boolean processOrder(OrderDto order) {
        return false;
    }

    @Override
    public boolean deliver(OrderDto order) {
        return false;
    }

    @Override
    public Map<Integer, String> getMenu() {
        return null;
    }
}
