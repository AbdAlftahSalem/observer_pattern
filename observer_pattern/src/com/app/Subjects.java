package com.app;

public interface Subjects {
    void notifyObserver();

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);
}
