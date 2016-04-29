package com.piushvaish;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by piush on 08/04/2016.
 */
public class BankClient {
    public static void main(String[] args) throws IOException{
        // write your code here
        final int SBAP_PORT = 8888;
        Socket s = new Socket("localhost",SBAP_PORT);
        InputStream instream = s.getInputStream();
        OutputStream outstream = s.getOutputStream();
        Scanner in = new Scanner(instream);
        PrintWriter out = new PrintWriter(outstream);

        String command = "Deposit 3 1000\n";
        System.out.println("Sending: " + command);
        out.print(command);
        out.flush();
        String response = in.nextLine();
        System.out.println("Receiving: " + response);

        command = "Withdraw 3 500\n";
        System.out.println("Sending: " + command);
        out.print(command);
        out.flush();
        response = in.nextLine();
        System.out.println("Receiving: " + response);

        command = "Quit\n";
        System.out.println("Sending: " + command);
        out.print(command);
        out.flush();

        s.close();
    }
}
