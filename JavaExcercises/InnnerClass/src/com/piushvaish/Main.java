package com.piushvaish;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        //local class
//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I have been attached!");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//        btnPrint.setOnClickListener(new ClickListener());
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }
        public static void listen(){

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
                        break;
                }
            }
        }


	// write your code here

//        GearBox mclaren = new GearBox(6);
//
//        mclaren.operatingClucth(true);
//        mclaren.changeGear(1);
//        mclaren.operatingClucth(false);
//        System.out.println(mclaren.wheelSpeed(1000));
//        mclaren.changeGear(2);
//        System.out.println(mclaren.wheelSpeed(3000));
//        mclaren.operatingClucth(true);
//        mclaren.changeGear(3);
//        mclaren.operatingClucth(false);
//        System.out.println(mclaren.wheelSpeed(6000));
        //different syntax for inner class
//        GearBox.Gear first = mclaren.new Gear(1,12.3);
//        System.out.println(first.driveSpeed(1000));

}

