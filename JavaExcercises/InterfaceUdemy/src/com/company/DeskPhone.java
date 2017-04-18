package com.company;

/**
 * Created by piush on 14/04/2017.
 */
public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerON() {
        System.out.println("No action taken, deskphone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");

    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {

        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring Ring");
        }else {
            return false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
