package com.kodilla.good.patterns.food;

import java.time.LocalDateTime;

public class OrderRequest {

    private Menu item;
    private User user;
    private LocalDateTime localDateTime;

    public OrderRequest(Menu item, User user, LocalDateTime localDateTime) {
        this.item = item;
        this.user = user;
        this.localDateTime = localDateTime;
    }

    public Menu getItem() {
        return item;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
