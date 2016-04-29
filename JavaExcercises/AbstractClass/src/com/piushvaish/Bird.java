package com.piushvaish;

/**
 * Created by piush on 24/04/2016.
 */
public abstract class Bird extends Animal implements ICanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breath in, breath out , repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
