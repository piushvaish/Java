package com.company;

/**
 * Created by piush on 14/04/2017.
 */
public interface ITelephone {
    void powerON();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();
}
