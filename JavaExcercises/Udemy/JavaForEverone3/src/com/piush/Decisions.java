package com.piush;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Piush on 19/12/2015.
 */
public class Decisions {
    public static  void main(String[] args){
        Logger.getGlobal().setLevel(Level.OFF);

        //for finding the middle

        String str = new String("crates") ;
        int position;
        int length;
        if (str.length() % 2 == 1)
        {
            position = str.length()/2;
            length = 1;
        }
        else
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        String result = str.substring(position,position + length);
        System.out.println(result);

        //income tax

        final double RATE1 = 0.10;
        final double RATE2 = 0.25;
        final double RATE1_SINGLE_LIMIT = 32000;
        final  double RATE1_MARRIED_LIMIT = 64000;
        double tax1 = 0;
        double tax2 = 0;
        //Read income and marital status

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        double income = in.nextDouble();

        System.out.print("Please enter s for single, m for married: ");
        String maritalStatus = in.next();

        //compute taxes due

        if(maritalStatus.equals("s"))
        {
            if (income <= RATE1_SINGLE_LIMIT)
            {
                tax1 = RATE1 * income;
            }
            else
            {
                tax1 = RATE1 * RATE1_SINGLE_LIMIT;
                tax2 = RATE2 * (income - RATE1_SINGLE_LIMIT);
            }
        }
        else
        {
            if (income <= RATE1_MARRIED_LIMIT)
            {
                tax1 = RATE1 * income;
            }
            else
            {
                tax1 = RATE1 * RATE1_MARRIED_LIMIT;
                tax2 = RATE2 * (income - RATE1_MARRIED_LIMIT);
            }
        }
        double totalTax = tax1 + tax2;
        Logger.getGlobal().info("STATUS IS singlE   ");
        System.out.println(totalTax);





    }
    

}
