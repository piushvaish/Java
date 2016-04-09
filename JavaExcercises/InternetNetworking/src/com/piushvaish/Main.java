package com.piushvaish;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
//https://java.net/projects/javamail/pages/Home for more projects
public class Main {

    public static void main(String[] args) throws IOException{

	// Get command Line arguments
        String urlString;
        if(args.length ==1){
            urlString = args[0];
        } else {
            urlString = "http://horstmann.com/";
        }

        //open connection

        URL u = new URL(urlString);
        URLConnection connection = u.openConnection();

        //Check the response code is HTTP_OK(200)

        HttpURLConnection httpConnection = (HttpURLConnection) connection;

        int code = httpConnection.getResponseCode();
        String message = httpConnection.getResponseMessage();
        System.out.println(code + " " + message);
        if(code != HttpURLConnection.HTTP_OK)
            return;

        //Read Server response
        InputStream instream = connection.getInputStream();
        Scanner in = new Scanner(instream);

        while(in.hasNext()){
            String input = in.nextLine();
            System.out.println(input);
        }
    }
}
