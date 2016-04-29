package com.company;

/**
 * Created by piush on 24/01/2016.
 */
public class Car {
    private int cylinder;
    private int wheels;
    private boolean engine;
    private String name;

    public Car(String name,int cylinder) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Engine is started";
    }
    public String accelerate(){
        return "Car is accelerated";
    }
    public String brake(){
        return "Brake is applied";
    }
}
