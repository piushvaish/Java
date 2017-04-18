package com.piushvaish;

/**
 * Created by piush on 13/03/2017.
 */
public class Bed {

    private int numPillows;
    private String mattressSize;

    public Bed(int numPillows, String mattressSize) {
        this.numPillows = numPillows;
        this.mattressSize = mattressSize;
    }

    public void sleep(){
        System.out.println("Sleep in bed");
    }

    public int getNumPillows() {
        return numPillows;
    }

    public String getMattressSize() {
        return mattressSize;
    }
}
