package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    /*unikalny identyfikator użytkownika (typu int)
nazwa użytkownika (typu String)
płeć (typu char), z wartościami ‘M’/’F’
data urodzenia (typu LocalDate)
ilość opublikowanych postów (typu int)*/
    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int posts;

    public ForumUser(int id, String username, char sex, LocalDate dateOfBirth, int posts) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPosts() {
        return posts;
    }
}
