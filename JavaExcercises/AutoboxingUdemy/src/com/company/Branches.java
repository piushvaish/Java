package com.company;

import java.util.ArrayList;

/**
 * Created by piush on 13/02/2016.
 */
public class Branches{

    private String name;
    private ArrayList<Customer> customers;

    public Branches(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }
    public String getName(){
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(initialAmount,customerName));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName , double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.setTransactions(amount);
            return true;

        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i = 0; i < this.customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }

}
