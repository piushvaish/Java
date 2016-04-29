package com.piushvaish;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("Yorkie");

        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Green Neck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();


    }
}
