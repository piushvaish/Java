package com.company;

public class Main {

    public static void main(String[] args) {
    /*char myChar = '\u00AE';
        String myString = "This is a string";
        System.out.println(myString);

        myString = myString + "\u00A9  2015";
        System.out.println(myString);
        */
        double myVar = 20;
        double secondVar = 80;
        double total = (myVar + secondVar) * 25;
        double remainder = total % 2300;
        if(remainder <= 200 )
            System.out.println("Total was over the limit");



    }
}
