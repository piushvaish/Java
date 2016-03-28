package com.piushvaish;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	Triangle t = new Triangle(10);
//        int area = t.getArea();
//        int pow2 = t.pow2(11);
//        int mystery = t.mystery(4);
//        System.out.println(pow2);
//        System.out.println(mystery);
//        System.out.println("Area: " + area);
//        System.out.println("Expected : 55");

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n = in.nextInt();
//        long f = fib(n);
//        System.out.println("fib(" + n + ") = " + f);

for (String s : permutations("eat")){
    System.out.println(s);

}
    }
        public static ArrayList<String> permutations(String word){
            ArrayList<String> result = new ArrayList<String>();
            if(word.length() == 0){
                result.add(word);
                return result;
            } else {
                for(int i = 0; i < word.length();i++){
                    String shorter = word.substring(0,i)+ word.substring(i + 1);
                    ArrayList<String> shorterPermutations = permutations(shorter);
                    for(String s : shorterPermutations){
                        result.add(word.charAt(i) + s);
                    }
                }
                return result;
            }

        }


    public static long fib(int n){
        System.out.println("Entering fib: n = " + n);
        long f;
        if(n <= 2){ f = 1;}
        else {
            f = fib(n-1) + fib(n-2);
        }
        System.out.println("Exiting fib: n = " + n + " return value = " + f);
        return f;
    }
}
