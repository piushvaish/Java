package com.company;

/**
 * Created by piush on 24/01/2016.
 */
public class Porsche extends Car {
    public Porsche(String name, int cylinder) {
        super(name, cylinder);
    }


    @Override
    public String startEngine() {
        return "Porche is started";
    }

    @Override
    public String accelerate() {
        return "Porche is accelerated";
    }

    @Override
    public String brake() {
        return "Porche is braked";
    }
}
