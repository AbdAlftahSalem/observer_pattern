package com.app;

public class CurrentConditionDisplay implements Observer {

    @Override
    public void update(double d1, double d2, double d3) {
        System.out.println("CurrentCondition is : \n" +"\n"+ d1 +"\n"+ d2 +"\n"+ d3);

    }
}
