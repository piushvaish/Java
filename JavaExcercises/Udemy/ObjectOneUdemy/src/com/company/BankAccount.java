package com.company;

/**
 * Created by Sinead on 15/01/2016.
 */
public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("1234",999.0,customerName,email,phoneNumber);
    }

    private String phoneNumber;

    public  BankAccount(){
        //calling another constructor from another. it has to be the first line.
        this("5454",6363.0,"default","defualt address","default phone no.");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number,double balance,String customerName,String email,String phoneNumber){
        //System.out.println("This is the new constructor.");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public void setNumber(String numberumber){
        this.number = number;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getNumber(){
        return this.number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositCash(double deposit){
        this.balance += deposit;
        System.out.println("Deposit of " + deposit + " made. New balance is "
        + balance);


    }
    public void withdrawCash(int withdrawal){
        if(this.balance - withdrawal < 0){
            System.out.println("Only" + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawal;
            System.out.println("Withdrawal of " + withdrawal +
                    " processed . Remaining balance is " + this.balance);
        }

    }


}
