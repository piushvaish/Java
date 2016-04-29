package com.piushvaish;

/**
 * Created by piush on 27/03/2016.
 */
public class StopWatch {
    private double elapsedTime;
    private double startTime;
    private boolean isRunning;

    public StopWatch(){
        reset();
;    }
    public void start(){
        if(isRunning) { return;}
        isRunning = true;
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        if(!isRunning) { return;}
        isRunning = false;
        double endTime = System.currentTimeMillis();
        elapsedTime = elapsedTime + endTime - startTime;
    }
    public double getElapsedTime(){
        if(isRunning){
            double endTime = System.currentTimeMillis();
            return elapsedTime + endTime - startTime;
        } else {
            return elapsedTime;
        }
    }
    public void reset(){
        elapsedTime = 0;
        isRunning = false;
    }
}
