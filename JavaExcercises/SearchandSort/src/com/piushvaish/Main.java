package com.piushvaish;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//  Sort Demo
//       int[] a = ArrayUtil.randomIntArray(10,20);
//        System.out.println(Arrays.toString(a));
//        MergeSort.mergeSort(a);
//        System.out.println(Arrays.toString(a));

        // timing the selection sort

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter array size: ");
//        int n = in.nextInt();
//
//        int[] a = ArrayUtil.randomIntArray(n,100);
//
//        StopWatch timer = new StopWatch();
//        timer.start();
//        SelectionSort.insertionSort(a);
//        timer.stop();
//        System.out.println("Elapsed time: " + timer.getElapsedTime() + "milliseconds");
        int[] a = ArrayUtil.randomIntArray(20, 100);
        System.out.println(Arrays.toString(a));
        Scanner in = new Scanner(System.in);

        boolean done = false;
        while (!done)
            {
            System.out.print("Enter number to search for, -1 to quit: ");
                int n = in.nextInt();
            if (n == -1)
                {
                done = true;
                }else
            {
                int pos = LinearSearcher.search(a, n);
                System.out.println("Found in position " + pos);
                }
            }
    }
}
