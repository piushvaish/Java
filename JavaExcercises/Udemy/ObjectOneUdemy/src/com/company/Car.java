package com.company;

/**
 * Created by Sinead on 15/01/2016.
 */
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colors;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera")|| validModel.equals("commodoro")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel(){
        return this.model;
    }


}
