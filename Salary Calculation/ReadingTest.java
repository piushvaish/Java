import javax.swing.*;  
import java.awt.*;  
import java.sql.*;  

class ReadingTest {

    public static void main( String[  ] args ) {
        try {
            // Load the database driver
            Class.forName( "com.mysql.jdbc.Driver" ) ;
            // Get a connection to the database
            Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/dbPay?user=root&password=1234") ;
            // Print all warnings
            for( SQLWarning warn = conn.getWarnings(); warn != null; warn = warn.getNextWarning() ) {
                System.out.println( "SQL Warning:" ) ;
                System.out.println("State  : " + warn.getSQLState());
                System.out.println("Message: " + warn.getMessage());
                System.out.println("Error  : " + warn.getErrorCode());
            }
            
            System.out.println("PART TIME TABLE:"); 
            Statement stmt = conn.createStatement(); //Get a statement from the connection
            ResultSet rs = stmt.executeQuery("SELECT * FROM tblPartTime" ) ;
            while( rs.next() )
                System.out.println( rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8) ) ; //This line prints the columns of the table
            rs.close() ;
            stmt.close() ;
            
            System.out.println();
            
            System.out.println("FULL TIME TABLE:");
            Statement stmt1 = conn.createStatement() ;          
            ResultSet rs1 = stmt1.executeQuery("SELECT * FROM tblFullTime" );
            while( rs1.next() )
                System.out.println( rs1.getString(1) + " " + rs1.getString(2) + " " + rs1.getString(3) + " " + rs1.getString(4) + " " + rs1.getString(5) + " " + rs1.getString(6) + " " + rs1.getString(7) + " " + rs1.getString(8) ) ; //This line prints the columns of the table
            rs1.close() ;
            stmt1.close() ;
            conn.close() ;
        } catch( SQLException se ) {
            System.out.println( "SQL Exception:" ) ;
            // Loop through the SQL Exceptions
            while( se != null ) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());
        
                se = se.getNextException() ;
            }
        } catch(Exception e) {
            System.out.println(e) ;
        }
     }
}
