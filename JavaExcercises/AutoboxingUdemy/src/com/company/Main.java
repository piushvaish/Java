package com.company;

public class Main {

    public static void main(String[] args) {
	Bank bank = new Bank("AIB");
        bank.addBranch("Dublin");
        bank.addCustomer("Dublin","Tim",50.00);
        bank.addCustomer("Dublin","Mike",150.00);
        bank.addCustomer("Dublin","Timothy",250.00);
        bank.addBranch("Carlow");

        bank.addCustomer("Carlow","Gaby",1000.00);

        bank.addCustomerTransaction("Dublin","Tim",45.00);
        bank.addCustomerTransaction("Dublin","Tim",900.00);
        bank.addCustomerTransaction("Dublin","Mike",142.60);

        bank.listCustomers("Dublin",true);
        bank.listCustomers("Carlow",true);

        if(!bank.addCustomer("Wicklow","Brian",5.53)){
            System.out.println("Error Wicklow branch not exist");
        }
    }
}
