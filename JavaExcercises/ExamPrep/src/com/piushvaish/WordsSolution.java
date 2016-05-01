package com.piushvaish;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by piush on 01/05/2016.
 */
public class WordsSolution {
    static final int NUMWORDS = 235886;
    static final String FILENAME = "C:\\Users\\piush\\Desktop\\Programming\\Java\\JavaExcercises\\ExamPrep\\src\\shuffled.txt";

    public static void main(String[] args) {
        String[] words = readWords(FILENAME, NUMWORDS);
        // 1. Write code to test method findShortest()
        System.out.println(findShortest(words));
        // 2. Write code to test method findLongest()
        System.out.println(findLongest(words));
        // 3. Write code to test method meanWordLength()
        System.out.println(meanWordLength(words));
        // 4. Write code to test method frequencyDistribution()
        double fdt[][] = frequencyDistribution(words);
        printFdt(fdt);
        // 5. Write code to test method sortedWords()
        String[] slice = new String[10000];
        for (int i  = 0; i < slice.length; i++) {
            slice[i] = words[i];
        }
        String[] sorted = sortedWords(slice);
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i - 0].compareTo(sorted[i]) > 0) {
                System.err.println("Error: found unsorted element at " + i);
            }
        }
        // 6. Write code to test method removeFourLetterWords()
        removeFourLetterWords(words);
        fdt = frequencyDistribution(words);
        printFdt(fdt);

    }

    // the shortest word
    private static String findShortest(String[] words) {
        String shortest = words[0];
        for (String w : words) {
            if (w != null && w.length() < shortest.length()) {
                shortest = w;
            }
        }
        return shortest;
    }

    // the longest word
    private static String findLongest(String[] words) {
        String longest = words[0];
        for (String w : words) {
            if (w != null && w.length() > longest.length()) {
                longest = w;
            }
        }
        return longest;
    }

    // mean word length
    private static double meanWordLength(String[] words) {
        double mwl = 0.0;
        for (String w : words) {
            mwl += w.length();
        }
        return mwl / words.length;
    }

    // frequency distribution
    private static double[][] frequencyDistribution(String[] words) {
        double[][] fdt;
        double frequency[] = new double[findLongest(words).length() + 1];
        for (String w : words) {
            if (w != null) {
                frequency[w.length()]++;
            }
        }
        int count = 0;
        for (double f : frequency) {
            if (f > 0) {
                count++;
            }
        }
        fdt = new double[count][2];
        int i = 0;
        for (int j = 1; j < frequency.length; j++) {
            if (frequency[j] > 0) {
                fdt[i][0] = j;
                fdt[i][1] = frequency[j];
                i++;

            }
        }
                return fdt;
        }
    private static void printFdt(double[][] fdt) {
        for (double[] aFdt : fdt) {
            System.out.println("[" + (int) aFdt[0] + ", " + (int) aFdt[1] + "] ");
        }
    }

    //sorted words
    private static String[] sortedWords(String[] words){
        String[] sorted = new String[words.length + 1];
        sorted[0] = words[0];
        for(String w: words){
            insertWord(sorted,w);
        }
        return sorted;
    }
    //insert a word
    private static void insertWord(String[] words, String newWord){
        int i = 0;
        while (i < words.length && words[i] != null){
            if(newWord.compareTo(words[i]) < 0){
                shiftRight(words,i);
                break;
            }
            i++;
        }
        words[i] = newWord;
    }
    private static void shiftRight(String[] words,int from){
        for(int i = words.length - 2; i >= from;i--){
            words[i + 1] = words[i];
        }
    }
    // remove 4 letters words
    private static void removeFourLetterWords(String[] words){
        int i = 0;
        while (i < words.length && words[i] !=null){
            if(words[i].length() == 4){
                removeWord(words,i);
                //do not advance the index id we have removed a word here
                continue;
            }
            i++;
        }
    }
    private static void removeWord(String[] words,int from){
        shiftLeft(words,from);

    }
    private static void shiftLeft(String[] words,int from){
        for(int i = from + 1;i < words.length;i++){
            words[i -1] = words[i];
        }
        words[words.length -1] = null;
    }


        // Helper: Read the words list from a file into a string array
        private static String[] readWords (String filename,int count){
            String[] words = new String[count];

            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                int i = 0;
                for (String line; (line = br.readLine()) != null && i < count; ) {
                    words[i++] = line;
                }
            } catch (java.io.IOException e) {
                System.err.println("File: " + filename + " could not be found.");
            }
            return words;
        }


}
