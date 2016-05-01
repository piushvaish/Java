package com.piushvaish;

/**
 * Created by piush on 01/05/2016.
 */
public class BusinessAccount {
    private String number;
    private String name;
    private double balance;

    public BusinessAccount(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
    public double increaseBalance(double num){
        return balance + num;
    }
    public double decreaseBalance(double num){
        return balance - num;
    }
}
