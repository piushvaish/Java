package com.piushvaish;



/**
 * Created by piush on 27/03/2016.
 */
public class SelectionSort {
    public static void sort(int[] a){
        for(int i = 0; i< a.length-1;i++){
            int minPos = minimumPosition(a,i);
            ArrayUtil.swap(a,minPos,i);
        }
    }

    private static int minimumPosition(int[] a,int from){
        int minPos = from;
        for(int i = from + 1;i<a.length;i++){
            if(a[i] < a[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }
    public static void insertionSort(int[]a){
        for(int i = 1; i < a.length;i++){
            int next = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > next) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = next;
        }
    }
}
