package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List <ForumUser> forumUsers = new ArrayList<>();
    public List <ForumUser> getUserList() {
        List <ForumUser> forumUsers = new ArrayList<>();
        LocalDate t = LocalDate.of(1984, 5, 10);
        LocalDate t1 = LocalDate.now();
        LocalDate t2 = LocalDate.of(2015, 1, 1);
        LocalDate t3 = LocalDate.of(2000, 1, 1);
        forumUsers.add(new ForumUser(1, "nickname", 'M', t, 1));
        forumUsers.add(new ForumUser(1, "nickname1", 'F', t1, 1));
        forumUsers.add(new ForumUser(1, "nickname2", 'M', t2, 7));
        forumUsers.add(new ForumUser(1, "nickname3", 'F', t3, 19));
        forumUsers.add(new ForumUser(1, "nickname4", 'M', t, 12));
        forumUsers.add(new ForumUser(1, "nickname5", 'F', t1, 5));
        forumUsers.add(new ForumUser(1, "nickname6", 'M', t2, 0));
        forumUsers.add(new ForumUser(1, "nickname7", 'F', t3, 3));
        forumUsers.add(new ForumUser(1, "nickname8", 'M', t, 20));
        forumUsers.add(new ForumUser(1, "nickname9", 'F', t1, 10));

        return forumUsers;
    }
}
