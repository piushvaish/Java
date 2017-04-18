package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

//
//        class ClickListener implements Button.OnClickListener{
//            public ClickListener(){
//                System.out.println("I have been attached");
//            }
//
//            @Override
//            public void onClick(String title){
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());

        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

        listen();
	// write your code here

//        Gearbox mcLaren = new Gearbox(6);
//        Gearbox.Gear first = mcLaren.new Gear(1,12.3);
//        System.out.println(first.driveSpeed(1000));

//        Gearbox mcLaren = new Gearbox(6);
////        mcLaren.addGear(1,5.3);
////        mcLaren.addGear(2,10.6);
////        mcLaren.addGear(3,15.9);
//
//        mcLaren.operatingClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operatingClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(2000));
//        mcLaren.operatingClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operatingClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));


    }

private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();

            }
        }
}
}
