package com.app;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subjects {

    List<Observer> observers;
    double m1, m2, m3;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void notifyObserver() {

        for (Observer observer : observers) {
            observer.update(m1, m2, m3);
        }

    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    void setMeasurement(double s1, double s2, double s3) {
        m1 = s1;
        m2 = s2;
        m3 = s3;
        notifyObserver();
    }


}
