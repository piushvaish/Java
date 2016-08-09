package com.piushvaish;

import java.io.*;

public class countInversions {

    public static int NUMS_LEN = 200000;
    public static String PATH = "IntegerArray.txt";

    public static void main(String args[]) {
        BufferedReader rd = OpenFileReader();
        int [] nums = new int[NUMS_LEN];
        int index = -1;
        try {
            while (true) {
                String num = rd.readLine();
                if (num == null) break;
                nums[++index] = Integer.parseInt(num);
            }
            rd.close();
        } catch (IOException ex) {
            System.out.println("An I/O Error has occured.");
        }
        System.out.println(index);
        System.out.print("The number of Inversions is: ");
        System.out.println(CountInversions(nums, 0, index));
    }

    public static BufferedReader OpenFileReader() {
        BufferedReader rd = null;
        try {
            while (rd == null) {
                rd = new BufferedReader(new FileReader(PATH));
            }
        } catch (IOException ex) {
            System.out.println("Can't open that file.");
        }
        return rd;
    }

    public static long CountInversions(int[] nums, int start, int end) {
        int[] tmpArr = new int[NUMS_LEN];
        return CountInversions(nums, tmpArr, start, end);
    }

    private static long CountInversions(int[] num, int[] tmpArr, int start, int end) {
        long countLeft, countRight, countSplit;
        int middle = (start + end) / 2;
        if (start >= end)
            return 0;
        countLeft = CountInversions(num, tmpArr, start, middle);
        countRight = CountInversions(num, tmpArr, middle+1, end);
        countSplit = CountSplit(num, tmpArr, start, middle+1, end);
        return (countLeft + countRight + countSplit);
    }
    private static long CountSplit(int[] num, int[] tmpArr, int leftPos,
                                   int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElem = rightEnd - leftPos + 1;
        long count = 0;

        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (num[leftPos] <= num[rightPos]) {
                tmpArr[tmpPos++] = num[leftPos++];
            } else {
                tmpArr[tmpPos++] = num[rightPos++];
                count += leftEnd - leftPos + 1;
            }
        }
        while (leftPos <= leftEnd) {
            tmpArr[tmpPos++] = num[leftPos++];
        }
        while (rightPos <= rightEnd) {
            tmpArr[tmpPos++] = num[rightPos++];
        }

        for (int i = 0; i < numElem; i++, rightEnd--) {
            num[rightEnd] = tmpArr[rightEnd];
        }

        return count;
    }
}
