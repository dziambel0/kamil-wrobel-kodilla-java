package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homevork implements Observable{

    private final List<Observer> observers;
    private final List<String> homeworks;

    private final String name;

    public Homevork(String name){
        observers = new ArrayList<>();
        homeworks = new ArrayList<>();
        this.name = name;
    }

    public void addHomework(String homework){
        homeworks.add(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.update(this);
        }
    }

    @Override
    public void removaObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public String getName() {
        return name;
    }
}
