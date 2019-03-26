package com.kodilla.good.patterns.food;

public class OrderDto {

    private Menu item;
    private User user;

    public Menu getItem() {
        return item;
    }

    public void setItem(Menu item) {
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
