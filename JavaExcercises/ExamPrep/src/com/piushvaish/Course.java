package com.piushvaish;

/**
 * Created by piush on 01/05/2016.
 */
public class Course {
    private String idNum;
    private String name;
    private double numOfHours;
    private double hourlyFees;

    public Course(String idNum,String name){
        this.idNum = idNum;
        this.name = name;
    }



    public void setNumOfHours(double numOfHours) {
        this.numOfHours = numOfHours;
    }
    public double getHourlyFees() {
        return hourlyFees;
    }

    public void setHourlyFees(double hourlyFees) {
        this.hourlyFees = hourlyFees;
    }

    public double totalWeeklyCost(){
        return numOfHours * hourlyFees;
    }
}
