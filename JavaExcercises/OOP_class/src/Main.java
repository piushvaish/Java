public class Main {

    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car holden = new Car();
//
//        //System.out.println("model is " +porsche.getModel());
//        porsche.setModel("Carrera");
//
//        System.out.println("model is " +porsche.getModel());


//        Account bobAccount = new Account();//"12345",0.0,"Bob Brown","bob@gmail.com","0871234567");
//        bobAccount.withdrawal(100.0);
//
//        bobAccount.deposit(50);
//        bobAccount.withdrawal(100);
//
//        System.out.println(bobAccount.getNumber());

        VIPCustomer bob = new VIPCustomer();
        System.out.println(bob.getName());


        VIPCustomer carl = new VIPCustomer("bob","bab@example.com");
        System.out.println(carl.getName());
    }
}
