package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone timsPhone;
        timsPhone = new DeskPhone(1234567);

        timsPhone.powerON();
        timsPhone.callPhone(1234567);
        timsPhone.answer();

        timsPhone = new MobilePhone(23456);
        timsPhone.powerON();

        timsPhone.callPhone(23456);
        timsPhone.answer();
    }
}
