package com.piushvaish;

/**
 * Created by piush on 01/05/2016.
 */
public class SupplierAccount extends BusinessAccount {

    private String tpyeOfGoods;

    public SupplierAccount(String number, String name, String tpyeOfGoods) {
        super(number, name);
        this.tpyeOfGoods = tpyeOfGoods;
    }

    public String getTpyeOfGoods() {
        return tpyeOfGoods;
    }
    public double sellGoods(double quantity){
        return quantity;
    }
    public double receivePayment(double cash){
        return cash;
    }

}
