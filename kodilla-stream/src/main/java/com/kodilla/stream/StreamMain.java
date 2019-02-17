package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date2 = LocalDate.of(1990, 01, 01);
        System.out.println(date.getYear()-date2.getYear());
        Forum forum = new Forum();
        Map<Integer, ForumUser> mapForum = forum.getUserList().stream()
            .filter(user -> user.getSex() == 'M'
                    && (date.getYear() - user.getDateOfBirth().getYear()) > 20
                    && user.getPosts() > 0)
            .collect(Collectors.toMap(ForumUser::getId, user -> user));

        System.out.println("# elements: " + mapForum.size());
        mapForum.entrySet().stream()
            .map(entry -> entry.getKey() + ": " + entry.getValue())
            .forEach(System.out::println);
        }
}