package com.piushvaish;

import java.sql.Connection;
import java.sql.SQLException;
// used with mySql with WorkBench
// youtube video : https://www.youtube.com/watch?v=NoPzqahrzp8
//add jar file-projectstructure-module-add the jar file(mysql-connector-java-5.1.38-bin) with green + sign
//for the class path add the jar file in the C:\Program Files\Java\jdk1.8.0_71\jre\lib\ext and in : C:\Program Files\Java\jre1.8.0_77\lib\ext
// database is in C:\ProgramData\MySQL\MySQL Server 5.7\Data\pay_calculation ( programdata is a hidden folder..change the settings to show the folders in windows appearance
// make sure you have the mysql server set up as started when windows start or reconfigure to have the server working
public class Main {

    public static void main(String[] args) {
        // test the connectivity
        Connection connection = null;
        try {
            //import the connection
            connection = ConnectionConfiguration.getConnection();
            if (connection != null) {
                System.out.println("Connection established!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//close the connection and it is important to prevent memory leak
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
