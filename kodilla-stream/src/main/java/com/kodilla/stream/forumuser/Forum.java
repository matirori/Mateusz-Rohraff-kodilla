package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1,"N0thing1", 'f', LocalDate.of(1823, Month.DECEMBER, 2), 2 ));
        forumUserList.add(new ForumUser(2,"N0thing2", 'm', LocalDate.of(1956, Month.DECEMBER, 2), 2 ));
        forumUserList.add(new ForumUser(3,"N0thing3", 'f', LocalDate.of(1785, Month.DECEMBER, 2), 5 ));
        forumUserList.add(new ForumUser(4,"N0thing4", 'm', LocalDate.of(1456, Month.DECEMBER, 2), 6 ));
        forumUserList.add(new ForumUser(5,"N0thing5", 'f', LocalDate.of(1456, Month.DECEMBER, 2), 7 ));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUserList);
    }
}
