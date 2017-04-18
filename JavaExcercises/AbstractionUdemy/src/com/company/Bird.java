package com.company;

/**
 * Created by piush on 15/04/2017.
 */
public abstract class Bird extends Animal implements ICanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breath in , breathe out" );

    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping from branch and branch");

    }
}
