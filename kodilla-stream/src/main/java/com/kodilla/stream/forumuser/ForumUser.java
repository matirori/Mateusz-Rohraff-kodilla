package com.kodilla.stream.forumuser;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;


public class ForumUser {
    private final int id;
    private final String userNickname;
    private final char sex;
    private final LocalDate birthdate;
    private final int quantityOfPublishedPosts;

    public ForumUser(final int id, final String userNickname, final char sex, LocalDate birthdate, final int quantityOfPublishedPosts) {
        this.id = id;
        this.userNickname = userNickname;
        this.sex = sex;
        this.birthdate = birthdate;
        this.quantityOfPublishedPosts = quantityOfPublishedPosts;
    }

    public int getId() {
        return id;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getQuantityOfPublishedPosts() {
        return quantityOfPublishedPosts;
    }

    public long getUserAge() {
        return YEARS.between(birthdate, LocalDate.now());
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userNickname='" + userNickname + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", quantityOfPublishedPosts=" + quantityOfPublishedPosts +
                '}';
    }
}
