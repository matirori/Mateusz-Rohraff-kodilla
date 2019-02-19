package com.kodilla.testing.forum.statistic;

public class ForumStatistics {
    private Statistic statistics;

    public ForumStatistics(Statistic statistics) {
        this.statistics = statistics;
    }
    double quantityOfUsers;
    double quantityOfForumPosts;
    double quantityOfForumComments;
    double avgQuantityOfPostsPerUser;
    double avgQuantityOfCommentsPerUser;
    double avgQuantityOfCommentsPerPost;

    public void calculateAdvanceStatistics() {

        quantityOfUsers = statistics.usersNames().size();
        quantityOfForumPosts = statistics.postsCount();
        quantityOfForumComments = statistics.commentsCount();
        if(quantityOfUsers == 0){
            avgQuantityOfPostsPerUser = 0;
            }else {
                avgQuantityOfPostsPerUser = quantityOfForumPosts / quantityOfUsers;}
        if(quantityOfUsers == 0){
            avgQuantityOfCommentsPerUser = 0;
            }else{
                avgQuantityOfCommentsPerUser = quantityOfForumComments / quantityOfUsers;}
        if (quantityOfForumPosts == 0) {
            avgQuantityOfCommentsPerPost = 0;
            }else{
                avgQuantityOfCommentsPerPost = quantityOfForumComments / quantityOfForumPosts;}
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