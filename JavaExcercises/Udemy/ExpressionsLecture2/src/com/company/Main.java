package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* write your code here
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 17;
        System.out.println((a + b)/ c);
        // 3 and 4 are added with sum 7
        // 7 is divided by 5 with quotient 1
        System.out.println(a + b / c);
        // 4 is divided by 5 with quotient 0
        // 3 is added to 0 with sum 3
        System.out.println(a++);
        // 3 is printed and then 1 is stored in memory as 4
        System.out.println(a--);
        //4 is printed and then it is stored in memory as 3
        System.out.println(a + 1);
        // 1 is added to 3 and printed as 4
        System.out.println(d % c);
        //The remainder of 17 and 5 is printed which is 2
        System.out.println(d / c);
        // 17 is divided by 5 and 3 is quotient
        System.out.println(d % b);
        //remainder of 17 and 4 ,print 1
        System.out.println(d / b);
        //divide 17/4 ,print 4
        System.out.println(d + a / d + b);
        //divide 3 / 17 ,quotient = 0 add 17 + 4 = print 21
        System.out.println((d + a) / (d + b));
        //add 17 + 3 and 17 + 4 ,divide, quotient=0
        System.out.println(Math.sqrt(b));
        // square root of 4  = 2
        System.out.println(Math.pow(a, b));
        //3 power of 4 = 81
        System.out.println(Math.abs(-a));
        //absolute of -3 , 3
        System.out.println(Math.max(a, b));
        //maximum value between 3,4 = 4

        Scanner firstNumber = new Scanner(System.in);
        System.out.println("Please enter two integers ");
        int a = firstNumber.nextInt();
        int b = firstNumber.nextInt();
        System.out.println("the larger number is " + Math.max(a,b));4

        int x = 10;
        int y = -3;

       x--;
        System.out.println("x = " + x);

        y++;
        System.out.println("y = " + y);


        int pmt = 10000;
        double i = .08;
        int n = 20;
        double pv;
        pv =pmt*(
                ((Math.pow(1+i,n-1)-1)/i)/Math.pow(1+i,n-1)+1);
        System.out.println("Present value = " + pv);

        int age1 = 18;
        int age2 = 35;
        int age3 = 50;
        int age4 = 44;
        double averageAge = (age1 + age2 + age3 + age4) / 4.0;
        System.out.println(averageAge);


        double probability = 8.70;
        int percentage = (int)Math.round (100 * probability);
        System.out.println(percentage);
        */
        String input = new String("The quick brown fox jumps over the lazy dog");

       String outputString = input.substring(0,1);
        outputString +=input.substring(2,3);
        outputString += input.substring(22,24);
        System.out.println(outputString);


    }
}
