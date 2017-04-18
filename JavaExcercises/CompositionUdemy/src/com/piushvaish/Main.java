package com.piushvaish;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dimensions dimensions = new Dimensions(20,20,5);
        Case thecase = new Case("2206","dell","240",dimensions);
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27, new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("BJ-200","Asus",4,6,"v2.4.4");
        PC thePC = new PC(thecase,theMonitor,motherboard);

        thePC.powerup();
    }


}
