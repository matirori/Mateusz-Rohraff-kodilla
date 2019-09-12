package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable{
    private final List<Observer> observers;
    private final List<String> listOfTaskInQueue;
    private final String student;

    public TaskQueue(String student) {
        this.student = student;
        this.listOfTaskInQueue = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void addTaskToQueue(String name) {
        listOfTaskInQueue.add(name);
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getStudent() {
        return student;
    }
}
