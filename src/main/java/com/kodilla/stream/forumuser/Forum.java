package com.kodilla.stream.forumuser;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(1, "pax", 'M', 2000, 10, 4, 356));
        forumUsersList.add(new ForumUser(2, "snowy", 'M', 1980, 12, 14, 45));
        forumUsersList.add(new ForumUser(3, "rose", 'F', 1995, 2, 24, 100));
        forumUsersList.add(new ForumUser(4, "crow", 'M', 1970, 1, 3, 450));
        forumUsersList.add(new ForumUser(5, "raven", 'M', 1999, 1, 8, 20));
        forumUsersList.add(new ForumUser(6, "sat", 'F', 1993, 5, 27, 1));
        forumUsersList.add(new ForumUser(7, "sao", 'F', 1985, 5, 18, 0));
        forumUsersList.add(new ForumUser(8, "korm", 'M', 1988, 9, 16, 90));
        forumUsersList.add(new ForumUser(9, "rain", 'M', 1965, 10, 8, 83));
        forumUsersList.add(new ForumUser(10, "lisa", 'F', 1964, 11, 26, 3890));
        forumUsersList.add(new ForumUser(11, "baloon", 'M', 1992, 8, 22, 394));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(forumUsersList);
    }
}
