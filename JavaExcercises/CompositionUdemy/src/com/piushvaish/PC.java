package com.piushvaish;

/**
 * Created by piush on 13/03/2017.
 */
public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerup(){
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        monitor.drawPixelat(1200,50,"yellow");
    }

//    private Case getThecase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
