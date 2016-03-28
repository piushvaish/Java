package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        CashRegister register1 = new CashRegister();
//        register1.addItem(1.95);
//        register1.addItem(0.95);
//        register1.addItem(2.50);
//        System.out.println(register1.getCount());
//        System.out.println(register1.getTotal());
//        register1.clear();
//        Rectangle box = new Rectangle(5,10,20,30);
//        String s = box.toString();
//
//        System.out.println("box=" + box);
//        Measurable[] accounts = new Measurable[3];
//        accounts[0] = new BankAccount(0.0);
//        accounts[1] = new BankAccount(100000.0);
//        accounts[2] = new BankAccount(2000.0);
//
//        System.out.println("Average Balance: " + average(accounts));

String [] words = { "Mary","Had","a","little","lamb"};
        Measurable lengthMeasurer = new StringMeasurer();
        double result = average(words,lengthMeasurer);
        System.out.println(result);

    }
    public static double average(Object[] objects, Measurable meas){
        if(objects.length == 0 ){return 0;}
        double sum = 0;
        for(Object obj : objects){
            sum = sum + meas.measure(obj);
        }

        return sum/objects.length;
    }
}
