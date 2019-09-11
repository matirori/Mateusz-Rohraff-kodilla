package com.kodilla.hibernate.manytomany.manytomany.dao.facade;

public class ManyToManyException extends Exception{
    public static String ERR_SEARCHEMPLOYEE_ERROR = "Cannot search employee";
    public static String ERR_SEARCHCOMPANY_ERROR = "Cannot search company";

    public ManyToManyException(String message) {
        super(message);
    }
}
