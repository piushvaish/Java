package com.piushvaish;

/**
 * Created by piush on 01/04/2016.
 */
public class WithdrawRunnable implements Runnable {
    /**
     * A withdraw runnable makes peroidic deposits to a bank account
     */

        private static final int DELAY = 1;
        private  BankAccount account;
        private double amount;
        private int count;

        /**
         * Construct a deposit runnable
         */
        public WithdrawRunnable(BankAccount anAccount,double anAmount,int aCount){
            account = anAccount;
            amount = anAmount;
            count = aCount;
        }
        public void run(){
            try{
                for(int i = 1; i <= count;i++){
                    account.withdraw(amount);
                    Thread.sleep(DELAY);
                }
            } catch(InterruptedException exception) {

            }
        }
}
