package com.piushvaish;

/**
 * Created by piush on 28/03/2016.
 */

/**
 * A deposit runnable mskes peroidic deposits to a bank account
 */
public class DepositRunnable implements  Runnable{
    private static final int DELAY = 1;
    private  BankAccount account;
    private double amount;
    private int count;

    /**
     * Construct a deposit runnable
     */
    public DepositRunnable(BankAccount anAccount,double anAmount,int aCount){
        account = anAccount;
        amount = anAmount;
        count = aCount;
    }
    public void run(){
        try{
            for(int i = 1; i <= count;i++){
                account.deposit(amount);
                Thread.sleep(DELAY);
            }
        } catch(InterruptedException exception) {

        }
    }


}
