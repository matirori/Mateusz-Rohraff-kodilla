package com.kodilla.spring.portfolio;

public final class Board {

    private TaskList toDoList;
    private TaskList inProgresList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgresList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgresList = inProgresList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgresList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
