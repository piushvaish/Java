package com.piushvaish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * use the method to connect the database
 */


/**
 * Created by piush on 03/04/2016.
 */
public class ConnectionConfiguration {
    public static Connection getConnection(){
        //create a new connection variable
        Connection connection = null;
        //use the try catch because the databases are risky move
        try {
            //connect to the sqlDatabase
            //point to the driver from sqlConnector
            Class.forName("com.mysql.jdbc.Driver");
            //takes three arguments:url to database,username and password
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pay_calculation","root","your_own_Password");

        }catch(SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;

    }
}
