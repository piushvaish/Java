package com.company;

import com.sun.javafx.image.IntPixelGetter;

import java.util.ArrayList;
//This acts like a wrapper
//class IntClass{
//    private int myValue;
//
//    public IntClass(int myValue) {
//        this.myValue = myValue;
//    }
//
//    public int getMyValue() {
//        return myValue;
//    }
//
//    public void setMyValue(int myValue) {
//        this.myValue = myValue;
//    }
//}

public class Main {

    public static void main(String[] args) {
//	String [] strArray = new String[10];
//	int[] intArray = new int[10];
//
//        ArrayList<String> stringArrayList = new ArrayList<String>();
//
//        //ArrayList<int> intArrayList = new ArrayList<int>();
//
//        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
//
//        intClassArrayList.add(new IntClass(54));
//
//        Integer integer = new Integer(54);
//        Double doubleValue = new Double(12.25);
////        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
////        for(int i = 0; i <=10; i++){
////            intArrayList.add(Integer.valueOf(i));
////        }
////
////        for(int i = 0; i <=10; i++){
////            System.out.println(i + " ---> " + intArrayList.get(i).intValue());
////        }
//
//
//        Integer myIntValue = 56; // Integer.valueOf(56)
//
//        int myInt = myIntValue;// myInt.intValue()
//
//        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
//
//        for(double dbl = 0; dbl <= 10.0; dbl += 0.5){
//            myDoubleValues.add(dbl);
//        }
//       for(int i = 0;i < myDoubleValues.size();i++){
//            double value = myDoubleValues.get(i);
//           System.out.println(i + " --> " + value);
//       }
//
//

        Bank bank = new Bank("Nation Irish Bank");
        bank.addBranch("Dublin");
        bank.addCustomer("Dublin","Manoo",50.05);
        bank.addCustomer("Dublin","Mike",175.34);
        bank.addCustomer("Dublin","Percy",220.12);

        bank.addBranch("Carlow");
        bank.addCustomer("Carlow","Bob",150.54);
        bank.addCustomerTransaction("Dublin","Manoo",44.22);
        bank.addCustomerTransaction("Dublin","Manoo",12.44);
        bank.addCustomerTransaction("Dublin","Mike",1.65);

        bank.listCustomers("Dublin",true);

    }
}
