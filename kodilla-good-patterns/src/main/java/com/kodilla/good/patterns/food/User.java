package com.kodilla.good.patterns.food;

public class User {
    private String name;
    private String surname;
    private String adress;
    private Long account;

    public User(String name, String surname, String adress, Long account) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAdress() {
        return adress;
    }

    public Long getAccount() {
        return account;
    }
}
