package com.company;

/**
 * Created by Sinead on 22/01/2016.
 */
public class Selection {
    static public void sort(Comparable...a){
        int N = a.length;
        for(int i=0;i<N;i++){
            int min = i;
            for(int j=i+1;j<N;j++){
                if(less(a[j],a[min]))
                    min = j;
                swap(a,i,min);
            }
        }
    }

    static private boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0;//return true if a is a-b<0;meaning a is less than b
    }

    static private void swap(Comparable[] a,int i,int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static public boolean isSorted(Comparable...a){
        int N = a.length;
        for(int i=1;i<N;i++){
            if(less(a[i],a[i-1]))//if a[i]<a[i-1] then the array is not in order. Eg. a[1]=5,a[(1-1=0)]=6 then the isNotSorted
                return false;
        }
        return true;
}
