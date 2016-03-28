package com.piushvaish;

/**
 * Created by piush on 28/02/2016.
 */
// use a capital I for interface class
public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}

