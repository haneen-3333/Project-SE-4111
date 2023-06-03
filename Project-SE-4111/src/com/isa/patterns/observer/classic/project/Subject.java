package com.isa.patterns.observer.classic.project;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}