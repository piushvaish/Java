import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExamples {

    public static void main(String[] args) {
        /*
        int[] scores = {10,9,7,4,5};
        int[] values = scores; //copying array reference
        scores[3] = 10;
        System.out.println(scores[3]);
        System.out.println(values[3]);



        final int LENGTH = 100;
        double[] values = new double[LENGTH];

//partially filled arrays
        int currentSize = 0;
        System.out.println("Please type in your array");
        Scanner in = new Scanner(System.in);
        //important to have an exit condition !in.equals("exit")
        while (in.hasNextDouble() && !in.equals("exit")) {
            if (currentSize < values.length) {
                values[currentSize] = in.nextDouble();
                currentSize++;
            }
        }
        for (int i = 0; i < currentSize; i++) {
            System.out.println(values[i]);


        }

        // for loop for array
        int[] primes = {0,0,3,5,7};
        double total = 0;
        for(double element: primes){
            if(element ==0){total++;}

        }

        System.out.println(total);

        //Element Separator
        double[] values = {32,64,67.5,29,35};
        for (int i =0; i < values.length;i++){
            if(i>0){
                System.out.print("|");

            }
            System.out.print(values[i]);
        }

        //linear Search
        double values[] = {10,00,10,1000,10,10000,100};
        int searchedValue = 100;
        int pos = 0;
        boolean found = false;
        while(pos < values.length && !found){
            if(values[pos] == searchedValue){
                found = true;
            } else {
                pos++;
            }
        }
        if(found) {
            System.out.println("Found at position: " + pos);
        } else {
            System.out.println("Not Found");
        }

         double[] values = {32,54,67.5,29,34.5,80,115,44.5,100,65};
        //Removing an element if in no particular order and replaced with last element(65)

        int currentSize = values.length;
        double searchedValue = 54;
        int pos = 0;
        boolean found = false;

        while(pos < currentSize && !found){
            if(values[pos] == searchedValue){
                found = true;

            } else {
                pos++;
            }
        }
        if(found) {
            values[pos] = values[currentSize-1];
            currentSize--;
            for (int i = 0; i < currentSize; i++) {
                System.out.println(values[i]);
                System.out.println("number of elements:" + (i+1));
            }
        }else {
            System.out.println("Not found");
        }


        //removing an element while maintaining the order
        double[] values = {32,54,67.5,29,34.5,80,115,44.5,100,65};
        int currentSize = values.length;
        double searchedValue = 34.5;
        int pos = 0;
        boolean found = false;

        while(pos < currentSize && !found){
            if(values[pos] == searchedValue){
                found = true;

            } else {
                pos++;
            }
        }
        if(found) {
            for(int i = pos + 1; i < currentSize; i++){
                values[i-1] = values[i];
            }
            currentSize--;
            for (int i = 0; i < currentSize; i++) {
                System.out.println(values[i]);
                System.out.println("number of elements:" + (i+1));
            }
        }else {
            System.out.println("Not found");
        }

        // simply insert new elements at the end
        double[] values = new double[10];
        int currentSize = values.length-1;
        if (currentSize < values.length) {

            currentSize++;
            values[currentSize-1] = 10000;
        }
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            System.out.println("number of elements:" + (i));
        }

        // to insert an element at a particular position

        double[] values = {32,54,67.5,34.5,80,115,44.5,100,0.0};
        int currentSize = values.length-1;
        int pos = 4;
        if(currentSize < values.length){
            currentSize++;
            for(int i = currentSize - 1; i > pos;i--){//very important... compared to remove for(int i = pos + 1; i < currentSize; i++){ values[i-1] = values[i];} currentSize--;
                values[i] = values[i-1];
            }
            values[pos] = 10000.00;
        }
        // for swapping elements
        double temp = values[2];
        values[2] = values[3];
        values[3] = temp;
// true copy of an array//import java.util.Arrays;

        double[] prices = Arrays.copyOf(values,2*values.length);//increased in array length
        values= prices;
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
            System.out.println("number of elements:" + (i));
        }



        double[] numbers= readInputs(5);
        multiply(numbers,10);
        printReversed(numbers);
        final int COUNTRIES = 7;
        final int MEDALS = 3;
        int[][] counts = new int [COUNTRIES][MEDALS];
        for(int i =0; i < COUNTRIES; i++){
            //process the ith row
            for(int j =0; j < MEDALS; j++){
                //process the jth column in ith row

                special cases for the top and bottom row of the arrays
                int total = 0;
                if(i >0) {
                    total = total + counts[i -1][j];
                }
                if (i < COUNTRIES -1){
                    total = total + counts[i +1][j];
                }

        System.out.printf("%8d", counts[i][j]);
    }
    System.out.println();//starts a new line at the end of the row
}


        // two dimensional array
        final int COUNTRIES = 7;
        final int MEDALS =3;
        String[] countries = {
                "Canada","China","Germany","Korea","Japan","Russia","United States"
        };
        int[][] counts = {
                {1, 0, 1},
                {1, 1, 0},
                {0, 0, 1},
                {1, 0, 0},
                {0, 1, 1},
                {0, 1, 1},
                {1, 1, 0},
        };
        System.out.println("            Country     Gold    Silver  Bronze  Total");
        //Print countries,counts and row totals
        for (int i = 0; i < COUNTRIES; i++){
            //Process the ith row
            System.out.printf("%18s", countries[i]);
            int total = 0;

            //Print each row element and update the row total
            for(int j =0; j < MEDALS; j++){
                System.out.printf("%8d", counts[i][j]);
                total = total + counts[i][j];
            }
            //Display the row total and print a new line
            System.out.printf("%8d\n",total);

        }
        */
        // arraylist

        ArrayList<String> names = new ArrayList<String>();
        names.add("emily");
        names.add("bob");
        names.add("cindy");
        //String name = names.get(2);// gets the third name
        // to set
        names.set(2,"Carolyn");
        String name = names.get(2);// gets the third name


        System.out.println(reverse(names));


    }

    //array methods have to different than main method
    public static double sum(double[] values) {
        double total = 0;
        for (double element : values) {
            total = total + element;
        }
        return total;
    }

    /**
     * Reads a sequence of floating numbers.
     *
     * @param numberOfInputs the number of inputs to read
     * @return an array containing the input values
     */
    public static double[] readInputs(int numberOfInputs) {
        System.out.println("Enter " + numberOfInputs + " numbers: ");
        Scanner in = new Scanner(System.in);
        double[] inputs = new double[numberOfInputs];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = in.nextDouble();
        }
        return inputs;
    }

    /**
     * Multiply all elements of an array by a factor
     *
     * @param values an array
     * @param factor the value with which element is multiplied
     */

    public static void multiply(double[] values, double factor) {
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * factor;
        }
    }

    /**
     * Prints an array in reverse order
     *
     * @param values an array of numbers
     * @return an array that contains the elements of values in reverse order
     */

    public static void printReversed(double[] values) {
        //Transverse the array in reverse order , starting with the last element
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    // method returning an array
    public static int[] squares(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i * i;
        }
        return result;
    }
    //Array List Methods
    public static ArrayList<String> reverse(ArrayList<String> names){
        //Allocate a list to hold the method result
        ArrayList<String> result = new ArrayList<String>();
        // to Transverse the names list

        for(int i = names.size() -1; i >=0; i--){
            //Add each name
            result.add(names.get(i));
        }
        return result;
    }



}
