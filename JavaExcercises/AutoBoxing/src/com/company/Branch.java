package com.company;

import java.util.ArrayList;

/**
 * Created by piush on 12/04/2017.
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customers;


    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;

        }
        return false;
    }
    private Customer findCustomer(String customerName){
        for (Customer checkedCustomers : this.customers) {
            if (checkedCustomers.getName().equals(customerName)) {
                return checkedCustomers;
            }
        }
        return null;

    }


}
