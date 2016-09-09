package com.piushvaish;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Clustering2 {
    private HashMap<BitSet, Integer> dataSet;
    private UnionFind uf;
    private int numberOfBits;
    private int numberOfNodes;
    private String filename = "/Users/Zhusong/Documents/Study/AlgorithmsDesignAndAnalysis/Assignments/Ass2/Ass2Prob2/clustering_big.txt";
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Clustering2 clustering2 = new Clustering2();
        clustering2.run();
    }

    private void run(){
        dataSet = new HashMap<BitSet, Integer>();
        build();
        calDis1();
        calDis2();
        System.out.println(uf.count());
    }

    /**
     * find nodes that have a distance of 2
     */
    private void calDis2(){
        Set<BitSet> keySet = dataSet.keySet();
        Iterator<BitSet> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            BitSet bitSet = (BitSet) iterator.next();
            for (int i = 0; i < numberOfBits; i++) {
                for (int j = 0; (j < numberOfBits) && (j != i); j++) {
                    BitSet temp = (BitSet) bitSet.clone();
                    temp.flip(i);
                    temp.flip(j);
                    if (dataSet.containsKey(temp)) {
                        uf.union(dataSet.get(bitSet), dataSet.get(temp));
                    }
                }
            }
        }
    }

    /**
     * find nodes that have a distance of 1
     */
    private void calDis1(){
        Set<BitSet> keySet = dataSet.keySet();
        Iterator<BitSet> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            BitSet bitSet = (BitSet) iterator.next();
            for (int i = 0; i < numberOfBits; i++) {
                BitSet temp = (BitSet) bitSet.clone();
                temp.flip(i);
                if (dataSet.containsKey(temp)) {
                    uf.union(dataSet.get(bitSet), dataSet.get(temp));
                }
            }
        }
    }

    /**
     * 1. read in the text file
     * 2. create a union find structure
     * 3. build the hash map and union the nodes that have 0 distances
     */
    private void build(){
        File file = new File(filename);
        try {
            BufferedReader rd = new BufferedReader(new FileReader(file));
            String line = rd.readLine();
            StringTokenizer tokenizer = new StringTokenizer(line);
            numberOfNodes = Integer.parseInt(tokenizer.nextToken());
            uf = new UnionFind(numberOfNodes);
            numberOfBits = Integer.parseInt(tokenizer.nextToken());
            //
            int index = 0;
            while ((line = rd.readLine()) != null) {
                tokenizer = new StringTokenizer(line);
                BitSet bitSet = new BitSet(numberOfBits);
                //creates a bit set demonstrating the current node
                for (int i = 0; i < numberOfBits; i++) {
                    if (tokenizer.nextToken().equals("1")) {
                        bitSet.set(i);
                    }
                }
                //put it in the hash map if no identical nodes are already in there
                if (!dataSet.containsKey(bitSet)) {
                    dataSet.put(bitSet, index);
                }
                //union the two nodes if the current node has a duplicate in the hash map
                else {
                    uf.union(index, dataSet.get(bitSet));
                }
                index++;
            }
            rd.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
                }
    }