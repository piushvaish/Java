package com.Piush;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Piush on 19/12/2015.
 */
public class Variables {
    public static void main(String[] args) {
        /*int cansPerPack =6;
        final double CAN_VOLUME = 0.355;//Litres in a 12 ounce can
        double totalVolume = cansPerPack * CAN_VOLUME;
        System.out.print("A six-pack of 12-ounce cans contains ");
        System.out.print(totalVolume);
        System.out.println(" litres.");

        final double BOTTLE_VOLUME = 2;//Two-Litre Bottle
        totalVolume = totalVolume + BOTTLE_VOLUME;
        System.out.print("A six-pack and a two-litre bottle contain ");
        System.out.print(totalVolume);
        System.out.println(" litres.");
        */
        //round off errors
        double price = 4.35;
        double quantity = 100;
        double total = price * quantity;
        System.out.println(total);

        //one way to solve round off errors
        BigDecimal priceBig = new BigDecimal("4.35");
        BigDecimal quantityBig = new BigDecimal("100");
        BigDecimal totalBig = priceBig.multiply(quantityBig);
        System.out.println(totalBig);

        //formatted output
        System.out.printf("Price: %f Quantity: %10f Total:%10.2f  \n",price,quantity,total);


        /* big numbers */
        BigInteger oneHundred = new BigInteger("100");
        BigInteger fiftyMillion = new BigInteger("5000000");
        System.out.println(oneHundred.multiply(fiftyMillion));

        // use of epsilon
        final double EPSILON;
        EPSILON = 1E-14;

        double r = Math.sqrt(2.0);
        /*
        if (r*r == 2.0)
        {
            System.out.println("Math.sqrt(2.0) squared is 2.0");
        }
        else
        {
            System.out.println("Math.sqrt(2.0) squared is not 2.0 but "
            + r*r);
        }
        */
        if ( Math.abs(r*r -2.0) < EPSILON)
        {
            System.out.println("Math.sqrt(2.0) squared is approximately 2.0");
        }

        //typical use of division and modulus
        int pennies = 1729;
        int dollar = pennies/100;//sets dollars to 17
        int cents = pennies % 100;// set cents = 29 or the remainder

        System.out.println(dollar +  "." + cents);
        double tax = 5.0;
        double balance = total + tax;
        int dollars = (int) balance;

        //unintended integer division
        int score1 = 10;
        int score2 = 4;
        int score3 = 9;
        //double average = (score1 + score2 + score3)/3.0;
        double intTotal = score1 + score2 + score3;
        double average = intTotal/3;
        System.out.println(average);

        Scanner in = new Scanner(System.in);
        //System.out.println("Please enter the number of bottles: ");
        //int bottles = in.nextInt();

        //string input
        System.out.println("Please" + " enter your first name: ");
        String first = in.next();
        System.out.println("Please enter your second name: ");
        String second = in.next();

        String initials = first.substring(0,1) + "&" + second.substring(0,1);
        System.out.println(initials);






    }
}
