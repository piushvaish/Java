package com.company;

/**
 * Created by Sinead on 16/01/2016.
 */
public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }
    private void moveFins(){

    }
    private void moveMuscles(){

    }
    private void swim(int speed){
        moveFins();
        moveMuscles();
        super.move(speed);

    }
}
