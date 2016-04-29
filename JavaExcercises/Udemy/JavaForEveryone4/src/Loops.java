import java.util.Scanner;

/**
 * Created by Piush on 22/12/2015.
 */
public class Loops
    {
        public static void main(String[] args)
        {

            /*

            //double investment
            final double INITIAL_BALANCE = 10000;
            final double TARGET = 2 * INITIAL_BALANCE;
            final double RATE = 5;
            double balance = INITIAL_BALANCE;
            int year = 0;

            while (balance <= TARGET)
            {
                year++;
                double interest = balance * RATE / 100;
                balance = balance + interest;
            }
            System.out.println(year);

            //using for loop

            System.out.print("Enter number of year: ");
            Scanner input = new Scanner(System.in);
            int nyears = input.nextInt();

            for(int yearInt =1; yearInt <= nyears; yearInt++)
            {
                double interest = balance * RATE/100;
                balance = balance + interest;
                System.out.printf("%4d %10.2f \n",yearInt,balance);
            }

            //sentinel values

            double sum = 0;
            int count = 0;
            double salary = 0;
            System.out.println("Please enter your salary: ");
            Scanner in = new Scanner(System.in);

            while (salary != -1)
            {
                salary = in.nextDouble();
                if (salary != -1) {
                    sum = sum + salary;
                    count++;
                }
            }
            //Compute and print the average

            if(count > 0)
            {
                double average = sum/count;
                System.out.println("Average Salary: " + average);
            }
            else
            {
                System.out.println("No data");
            }


            //using boolean sentinel
            double sum = 0;
            int count = 0;
            // needed for others to calculate but not for break
            // //double salary = 0;
            System.out.println("Please enter your salary: , -1 to finish");
            Scanner in = new Scanner(System.in);
            boolean done = false;
            //while (in.hasNextDouble())
            /*while(!done)
            {
                salary = in.nextDouble();
                if (salary == -1)
                {
                    done = true;
                }
                else
                {

            //special case break
            while(true)
            {
                double salary = in.nextDouble();
                if(salary == -1) {break;}
                    sum = sum + salary;
                    count++;


            }


            //Compute and print the average

            if(count > 0)
            {
                double average = sum/count;
                System.out.println("Average Salary: " + average);
            }
            else
            {
                System.out.println("No data");
            }


            double total =0;
            int count = 0;
            double inputAverage =0;
            System.out.println("Please enter how many times: ,q to finish");
            Scanner inAverage = new Scanner(System.in);


            while(inAverage.hasNextDouble())
            {

                inputAverage = inAverage.nextDouble();
                total = total + inputAverage;
                count++;


            }
            System.out.println("the total is :" + total);
            double average =0;
            if(count >0)
            {
                average = total/count;
                System.out.println("The average is: " + average);
            }

            //counting matches
            String str = new String("My fair Lady");
            int spaces = 0;
            for(int i = 0; i < str.length(); i++)
            {
                char ch = str.charAt(i);
                if(ch == ' ')
                {
                    spaces++;
                }
            }
            System.out.println("Number of spaces is :" + spaces);




            System.out.println("Please enter a string: , enter exit to exit");
            Scanner in = new Scanner(System.in);
            int shortWords = 0;

            while(in.hasNext())
            {
                String input = in.next();
                //very important
                // to break the scanner insert a control in the loop for an exit string. either by while(sc.hasNext() && !s1.equals("exit")) {
                // operate } or as follows


                if(input.equals("exit")) {
                    break;
                }

                if (input.length() <= 3)
                    {
                        shortWords++;

                    }



            }
            System.out.println("Number of short words are: " + shortWords);

             //finding the first match
            String strFirst = new String("My fair Lady");
            boolean found = false;
            char ch='?';
            int position = 0;
            while(!found && position < str.length())
            {
                ch = strFirst.charAt(position);
                if(ch ==' ')
                {
                    found = true;
                } else
                {
                    position ++;
                }
            }
            System.out.println("Position is :" + position);

            //
            System.out.println("Please enter a list of numbers");
            Scanner in = new Scanner(System.in);
            double input = in.nextDouble();
            while(in.hasNextDouble())
            {
                double previous = input;
                input = in.nextDouble();
                if(input == previous)
                {
                    System.out.println("Duplicate Input");
                }

            }

            final int JMAX = 4;
            final double IMAX = 10;

            //print table header
            for(int j = 1; j <= JMAX; j++)
            {
             System.out.printf("%10d",j);

            }
            System.out.println();

            for(int j = 1; j <= JMAX; j++)
            {
                System.out.printf("%10s", "x ");
            }
            System.out.println();

            //print table body

            for(double i = 1; i <= IMAX; i++)
            {
                //print table row
                for(int j = 1 ; j <= JMAX; j++)
                {
                    System.out.printf("%10.0f", Math.pow(i,j));

                }
                System.out.println();

            }
 */
            for(int i = 1; i <=10;i++)
            {
                //generate two random numbers between 1 and 6
                int d1 = (int) (Math.random() * 6 ) + 1;
                int d2 = (int) (Math.random() * 6 ) + 1;
                System.out.println(d1 + " " + d2);
            }





        }
    }

