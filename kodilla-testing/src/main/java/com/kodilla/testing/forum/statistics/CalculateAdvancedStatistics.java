package com.kodilla.testing.forum.statistics;

/*

liczbę użytkowników,
liczbę postów,
liczbę komentarzy,
średnią liczbę postów na użytkownika,
średnią liczbę komentarzy na użytkownika,
średnią liczbę komentarzy na post.

Stworzona klasa powinna posiadać metodę calculateAdvStatistics(Statistics statistics),
która obliczy podane powyżej wartości i zapamięta je we właściwościach (polach) klasy.
Możesz również dopisać metodę showStatistics(), która wyświetli zapamiętane we właściwościach statystyki.
 */

import java.util.List;

public class CalculateAdvancedStatistics {

    private int noOfUsers;
    private int noOfPosts;
    private int noOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;
    public Statistics statistics;


    public CalculateAdvancedStatistics(Statistics statistics) {
        this.statistics = statistics;
        noOfUsers = statistics.usersNames().size();
        noOfPosts = statistics.postsCount();
        noOfComments = statistics.commentsCount();
        if (noOfUsers == 0) {
            avgPostsPerUser = -1;
            avgCommentsPerUser = -1;
        } else {
            avgPostsPerUser = noOfPosts / noOfUsers;
            avgCommentsPerUser = noOfComments / noOfUsers;
        }
        if (noOfPosts == 0) {
            avgCommentsPerPost = -1;
        } else {
            avgCommentsPerPost = noOfComments / noOfPosts;
        }
    }

    public int getNoOfUsers() {
        return this.noOfUsers;
    }

    public int getNoOfPosts() {
        return noOfPosts;
    }

    public int getNoOfComments() {
        return noOfComments;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}
