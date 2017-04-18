package com.piushvaish;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i = 0; i < myIntegers.length;i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("The average is " + getaverage(myIntegers));
    }
//	// write your code here
//
//        //int [] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//        double [] myDoubleArray = new double[10];
//
//        int[] myIntArray = new int[10];
//
//        for(int i =0; i< myIntArray.length;i++){
//            myIntArray[i] = i*10;
//        }
////        for(int i = 0;i<myIntArray.length;i++) {
////            System.out.println("Element " + i + ", value is " + myIntArray[i]);
////        }
//
//        printArray(myIntArray);

        //input the number and add everything






    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i =0; i < values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getaverage(int[] array){
        int sum = 0;

        for(int i =0; i < array.length;i++) {
            sum += array[i];
        }
        return (double) sum/(double)array.length;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    private static void reSizeArray(int[] myInteger){
        int[] original = myInteger;
        myInteger = new int[12];
        for (int i = 0; i < original.length; i++) {
            myInteger[i] = original[i];
        }
    }
}

