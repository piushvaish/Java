package com.company;

/**
 * Created by piush on 24/01/2016.
 */
public class Printer {
    private int tonerLevel = 100;
    private int numOfPagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {

        if(tonerLevel >=-1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.numOfPagesPrinted = 0;
        this.duplex = duplex;
    }

    public int fillUpToner(int quantity){
        if(tonerLevel > 0 && quantity <= 100) {
            if(this.tonerLevel + quantity > 100){
                return -1;
            }
            this.tonerLevel += quantity;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }

    public int printPage(int pages){
        int pagestoPrint = pages;
        if(this.duplex){
            pagestoPrint /=2;
            System.out.println("Printing in duplex mode");
        }
        this.numOfPagesPrinted += pagestoPrint;
        return pagestoPrint;
    }
    public int getNumOfPagesPrinted(){
        return numOfPagesPrinted;
    }
}
