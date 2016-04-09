package com.piushvaish;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by piush on 06/04/2016.
 * A server class implementing a simple bank access protocol
 *These programs are meant for web browser,chats,peer to peer sharing etc..
 */
public class BankServer {
    public static void main(String[] args) throws IOException {
        // write your code here
        final int ACCOUNTS_LENGTH = 10;
        Bank bank = new Bank(ACCOUNTS_LENGTH);
        final int SBAP_PORT = 8888;
        ServerSocket server = new ServerSocket(SBAP_PORT);
        System.out.println("Waiting for client to connect...");

        while (true){
            Socket s = server.accept();
            System.out.println("Client connected.");
            BankService service = new BankService(s,bank);
            // to make sure more than one person can connect to the application
            Thread t = new Thread(service);
            t.start();
        }
    }

}
