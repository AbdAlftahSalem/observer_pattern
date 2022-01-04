package com.app;

public class Main {

    public static void main(String[] args) {

        StatistacDisplay statistacDisplay = new StatistacDisplay();

        WeatherData weatherData = new WeatherData();

        weatherData.registerObserver(statistacDisplay);

        weatherData.setMeasurement(2,5,3);

    }
}
