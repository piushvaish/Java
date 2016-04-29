package com.piushvaish;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone timsPhone;
        //DeskPhone timsphone is also valid, but it is easy to create a new instance
        // use the actual class which has overwritten the methods
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(234567);
        timsPhone.powerOn();
        timsPhone.callPhone(234567);
        timsPhone.answer();

    }
}
