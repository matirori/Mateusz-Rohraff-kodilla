package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }
    double quantityOfUsers;
    double quantityOfForumPosts;
    double quantityOfForumComments;
    double avgQuantityOfPostsPerUser;
    double avgQuantityOfCommentsPerUser;
    double avgQuantityOfCommentsPerPost;

    public void calculateAdvanceStatistics(Statistics statistics) {

        quantityOfUsers = statistics.usersNames().size();
        quantityOfForumPosts = statistics.postsCount();
        quantityOfForumComments = statistics.commentsCount();
        avgQuantityOfPostsPerUser = quantityOfForumPosts / quantityOfUsers;
        avgQuantityOfCommentsPerUser = quantityOfForumComments / quantityOfUsers;
        avgQuantityOfCommentsPerPost = quantityOfForumComments / quantityOfForumPosts;
    }

    public double getAvgQuantityOfPostsPerUser(){
        return avgQuantityOfPostsPerUser;
    }

    public double getAvgQuantityOfCommentsPerUser() {
        return avgQuantityOfCommentsPerUser;
    }

    public double getAvgQuantityOfCommentsPerPost() {
        return avgQuantityOfCommentsPerPost;
    }
}