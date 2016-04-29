package com.company;

/**
 * Created by Sinead on 16/01/2016.
 */
public class VipCustomer {
    private String name;
    private  double creditLimit;
    private String emailAddress;

    public VipCustomer(String name, double creditLimit,String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(){
        this("default Name",10.0,"default@email.com");
    }
    public VipCustomer(String name,double creditLimit){
        this(name,creditLimit,"bob@example.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
