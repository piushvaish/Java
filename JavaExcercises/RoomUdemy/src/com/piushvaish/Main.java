package com.piushvaish;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Door theDoor = new Door("blue","wood");
        Bed theBed = new Bed(2,"King");
        Room newRoom = new Room(theDoor,theBed);
        newRoom.getTheDoor().openDoor();
        newRoom.bedSleep();


    }
}
