package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return  new ShoppingTask("Food Shopping", "milk, eggs, bread", 2);
            case DRIVINGTASK:
                return  new DrivingTask("Drive to home", "Gdynia", "car");
            case PAINTINGTASK:
                return new PaintingTask("Paint ASAP", "red", "wall and ceiling");
            default:
                return null;
        }
    }
}
