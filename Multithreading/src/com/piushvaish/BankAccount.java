package com.piushvaish;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by piush on 01/04/2016.
 */
//https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/locks/Condition.html
    //always use signal all and not signal
    //locks and condition help in synchronisation issues
public class BankAccount {
    private double balance;
    private Lock balanceChangeLock;
    private Condition sufficientFundsCondition;

    public BankAccount(){
        balance = 0;
        balanceChangeLock = new ReentrantLock();
        sufficientFundsCondition = balanceChangeLock.newCondition();
    }

    public  void deposit(double amount){
        //use lock and unlock
        balanceChangeLock.lock();
        try {

            System.out.print("Depositing " + amount);
            double newBalance = balance + amount;
            System.out.println(" , new balance is " + newBalance);
            balance = newBalance;
            sufficientFundsCondition.signalAll();
        } finally {
            balanceChangeLock.unlock();
        }
    }
    public  void withdraw(double amount) throws InterruptedException{
        balanceChangeLock.lock();
        try {
            while (balance < amount) {
                sufficientFundsCondition.await();
                System.out.print("Withdrawing " + amount);
                double newBalance = balance - amount;
                System.out.println(" , new blance is " + newBalance);
                balance = newBalance;
            }
        }finally {
            balanceChangeLock.unlock();
        }
    }
    public  double getBalance(){
        return balance;
    }
}
