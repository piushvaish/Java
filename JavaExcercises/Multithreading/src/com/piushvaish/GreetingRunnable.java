package com.piushvaish;

import java.util.Date;

/**
 * http://beginnersbook.com/2013/03/multithreading-in-java/
 * Created by piush on 28/03/2016.
 * A runnable that repeatedly prints a greeting
 */
public class GreetingRunnable implements Runnable{
    private static final int Repititions =100;
    private static final int Delay = 1000;
    private String greeting;

    /**
     * Constructor
     * @param aGreeting
     */
    public GreetingRunnable(String aGreeting){
        greeting = aGreeting;
    }
    @Override
    public void run() {
        try{
            //Check for thread interruptions or terminating thread
            for(int i = 1;i < Repititions && !Thread.interrupted(); i++){
                Date now = new Date();
                System.out.println(now + "" + greeting);
                Thread.sleep(Delay);
            }
        }
        //place the entire thread action in a try
        catch (InterruptedException exception){

        }

    }
}
