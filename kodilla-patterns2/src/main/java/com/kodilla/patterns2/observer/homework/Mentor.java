package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println("New Task in queue added from  " + taskQueue.getStudent());
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
