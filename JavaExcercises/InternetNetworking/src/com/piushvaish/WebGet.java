package com.piushvaish;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by piush on 06/04/2016.
 * This program demonstrate how to use a socket to communicate with a web ser. Supply the name of the host and resource on the command
 * line for example
 * java WebGet piushvaish.com index.html
 */
public class WebGet {
    public static void main(String[] args) throws IOException {
        // Get the command line arguments
        String host;
        String resource;

        if (args.length == 2){
            host = args[0];
            resource = args[1];
        } else {
            System.out.println("Getting / from piushvaish.com");
            host = "piushvaish.com";
            resource = " /";

        }

        //Open Socket
        //handle the IOException above
        final int HTTP_PORT = 80;
        Socket s = new Socket(host,HTTP_PORT);
        //Get the streams

        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();

        //Turn streams into scanner and writer

        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        //Printerwriter does not send the characters immediately. It buffers and send as an array
        //Send command
        String command = "GET" + resource + "HTTP/1.1\n" + "Host: " + host + "\n\n";
        out.print(command);
        out.flush();

        // Read the server responses
        while (in.hasNextLine()){
            String input = in.nextLine();
            System.out.println(input);
        }
        //close the socket at the end
        s.close();


    }
}
