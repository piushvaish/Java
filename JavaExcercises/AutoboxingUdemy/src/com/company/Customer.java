package com.company;

import java.util.ArrayList;

/**
 * Created by piush on 13/02/2016.
 */
public class Customer {
    private ArrayList<Double> transactions;
    private String name;

    public Customer(double initialAmount, String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        setTransactions(initialAmount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(double amount) {

        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

}
