package com.piushvaish;

/**
 * Created by piush on 01/05/2016.
 */
public class CustomerAccount extends BusinessAccount {

    public CustomerAccount(String number, String name, double balance) {
        super(number, name);
        balance = getBalance();
    }
    public boolean buyGoods(double value){
        if((getBalance()- value) < 0){
            return true;
        } else {
            return false;
        }
    }
    public double makePayment(double payment){
        return payment;
    }
}
