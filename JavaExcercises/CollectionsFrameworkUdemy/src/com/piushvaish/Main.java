package com.piushvaish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theatre theatre = new Theatre("olympian",8,12);
        // it is a shallow copy. It is not copied. It contains the same refrences to the list. even if separate list
//        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        printList(seatCopy);
        //seatCopy.get(1).reserve();
        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat is already reserved");
        }
        if(theatre.reserveSeat("B13")){
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat is already reserved");
        }
        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat is already reserved");
        }
        List<Theatre.Seat> reserveSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reserveSeats);
        printList(reserveSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00",13.00));
        priceSeats.add(theatre.new Seat("A00",13.00));
        Collections.sort(priceSeats,Theatre.PRICE_ORDER);
        printList(priceSeats);
        //Collections.reverse(seatCopy);
        //Collections.shuffle(seatCopy);
//        System.out.println("printing seatCopy");
//        printList(seatCopy);
//        System.out.println("printing theatre.seat");
//        printList(theatre.seats);
//        //theatre.getSeats();
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//
//        System.out.println("min seat number is " + minSeat.getSeatNumber() );
//        System.out.println("max seat number is " + maxSeat.getSeatNumber() );
//
//        sortList(seatCopy);
//        System.out.println("printing sorted seatCopy");
//        printList(seatCopy);
//
//// Collections copy method doesnot work all the time
////        if(theatre.reserveSeat("H11")){
////            System.out.println("Please pay");
////        } else {
////            System.out.println("Sorry, the seat is taken");
////        }
    }
    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber() + " $ " + seat.getPrice());
        }
        System.out.println();
        System.out.println("=================================");
    }

//    public static void sortList(List<? extends Theatre.Seat> list){
//        for(int i = 0; i < list.size();i++){
//            for(int j = i+1; j < list.size();j++){
//                if(list.get(i).compareTo(list.get(j)) > 0){
//                    Collections.swap(list,i,j);
//                }
//            }
//        }
//    }
}
