package com.piushvaish;

/**
 * Created by piush on 13/03/2017.
 */
public class Room {
    private Door theDoor ;
    private Bed theBed;

    public Room(Door theDoor, Bed theBed) {
        this.theDoor = theDoor;
        this.theBed = theBed;
    }

    public Door getTheDoor() {
        return theDoor;
    }

    public void bedSleep(){
        theBed.sleep();
    }
}
