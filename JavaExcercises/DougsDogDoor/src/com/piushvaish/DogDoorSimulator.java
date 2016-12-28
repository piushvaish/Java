package com.piushvaish;

public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside...");
        remote.pressButton();

        System.out.println("\nFido has gone outside...");
        //remote.pressButton();

        System.out.println("\nFido's all done...");
        //remote.pressButton();
        try{
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {}
        System.out.println("... but he is stuck outside");
        System.out.println("\nFido starts barking....");
        System.out.println("so Todd grabs the remote control.");
        remote.pressButton();

        System.out.println("\nFido's back inside...");
        //remote.pressButton();
    }
}
