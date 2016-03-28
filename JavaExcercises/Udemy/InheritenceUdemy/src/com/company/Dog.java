package com.company;

/**
 * Created by Sinead on 16/01/2016.
 */
public class Dog extends Animal {
    private  int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

//    If you have no constructor in the sub class, then the super class constructor will be called. But you will get a compile time error if the super class does not have a default constructor (one with no parameters).
//
//    But if you have a constructor in the sub class, then the super class constructor will not automatically be called. You need to use the super keyword to invoke it in that instance.

    public Dog(String name,int size, int weight, int eyes,int legs, int tail,int teeth,String coat) {
        super(name, 1, 1, size, weight);
    }

    public void chew(){
        System.out.println("Dog.chew() is called");
    }



    public void walk(){
        System.out.println("Dog.walk() is called");
        System.out.println("Dog.move() from animal class is called");
        super.move(5);

    }
    public void run(){
        System.out.println("Dog.run() is called");
        move(20);

    }
    public void movelegs(){
        System.out.println("dog.movelegs() is caled");
    }

    @Override
    public void move(int speed) {
        movelegs();
        System.out.println("the dog (override) is moving at " + speed);
       super.move(speed);
    }

    @Override
    public void eat() {

        System.out.println("Dog.eat() is called");
        chew();
        super.eat();
    }
}
