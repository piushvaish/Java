package com.company;

/**
 * Created by piush on 24/01/2016.
 */
public class Mazda extends Car {
   public Mazda(String name,int cylinder){
       super(name,cylinder);
   }
    public String startEngine() {
        return "Mazda is started";
    }

    @Override
    public String accelerate() {
        return "Mazda is accelerated";
    }

    @Override
    public String brake() {
        return "Mazda is braked";
    }

}
