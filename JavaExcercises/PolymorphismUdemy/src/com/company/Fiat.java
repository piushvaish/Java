package com.company;

/**
 * Created by piush on 24/01/2016.
 */
public class Fiat extends Car{

    public Fiat(String name, int cylinder) {
        super(name, cylinder);
    }
    public String startEngine() {
        return "Fiat is started";
    }

    @Override
    public String accelerate() {
        return "Fiat is accelerated";
    }

    @Override
    public String brake() {
        return "Fiat is braked";
    }
}
