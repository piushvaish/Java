import javax.swing.JOptionPane;
import java.sql.*;  
import javax.swing.*;  
import java.awt.*;  

public class CalculationTest {
    public static void main( String[  ] args ) {
        Staff staffs[  ] = new Staff[ 10 ]; //hardcoded values
        
        staffs [ 0 ] = new PartTime("", "", 2500, 2, 5, 15); //hardcoded values
        staffs [ 1 ] = new PartTime("", "", 2751, 1, 10, 20); //hardcoded values
        staffs [ 2 ] = new PartTime("", "", 1500, 6, 15, 11.5); //hardcoded values  
        staffs [ 3 ] = new PartTime("", "", 3000, 2, 5, 15); //hardcoded values
        staffs [ 4 ] = new PartTime("", "", 8051, 1, 10, 20); //hardcoded values
        
        staffs [ 5 ] = new FullTime("", "", 2500, 12, 15); //hardcoded values
        staffs [ 6 ] = new FullTime("", "", 2751, 12, 20); //hardcoded values
        staffs [ 7 ] = new FullTime("", "", 1500, 12, 11.5); //hardcoded values  
        staffs [ 8 ] = new FullTime("", "", 3000, 12, 15); //hardcoded values
        staffs [ 9 ] = new FullTime("", "", 8051, 12, 20); //hardcoded values
             
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn1 = DriverManager.getConnection( "jdbc:mysql://localhost:3306/dbPay?user=root&password=1234") ;
            for(SQLWarning warn = conn1.getWarnings(); warn != null; warn = warn.getNextWarning()) {
                System.out.println( "SQL Warning:" ) ;
                System.out.println( "State  : " + warn.getSQLState()  ) ;
                System.out.println( "Message: " + warn.getMessage()   ) ;
                System.out.println( "Error  : " + warn.getErrorCode() ) ;
            }
            Statement stmt1 = conn1.createStatement() ;
        
            stmt1.executeUpdate( "INSERT INTO tblPartTime(ppsn, name, salary, months, expenses, taxes, calculatedpay) Values ('12345D', 'ggg', '2500', '2', '5', '15', '" + staffs[ 0 ].computePay() + "')" ) ;
            stmt1.executeUpdate( "INSERT INTO tblPartTime(ppsn, name, salary, months, expenses, taxes, calculatedpay) Values ('158H5D', 'qqq', '2751', '1', '10', '20', '" + staffs[ 1 ].computePay() + "')" ) ;
            stmt1.executeUpdate( "INSERT INTO tblPartTime(ppsn, name, salary, months, expenses, taxes, calculatedpay) Values ('H5S8U5', 'eee', '1500', '6', '15', '10.5', '" + staffs[ 2 ].computePay() + "')" ) ;
            stmt1.executeUpdate( "INSERT INTO tblPartTime(ppsn, name, salary, months, expenses, taxes, calculatedpay) Values ('68925U', 'rrr', '3000', '2', '5', '15', '" + staffs[ 3 ].computePay() + "')" ) ;
            stmt1.executeUpdate( "INSERT INTO tblPartTime(ppsn, name, salary, months, expenses, taxes, calculatedpay) Values ('9999Y5', 'ttt', '8051', '1', '10', '20', '" + staffs[ 4 ].computePay() + "')" ) ;
        
            stmt1.executeUpdate( "INSERT INTO tblFullTime(ppsn, name, salary, months, expenses, taxes, calculatedpay) Values ('55555L', 'iiig', '2500', '12', '0', '15', '" + staffs[ 5 ].computePay() + "')" ) ;
            stmt1.executeUpdate( "INSERT INTO tblFullTime(ppsn, name, salary, months, expenses, taxes, calculatedpay) Values ('5TH6UY', 'fff', '2751', '12', '0', '20', '" + staffs[ 6 ].computePay() + "')" ) ;
            stmt1.executeUpdate( "INSERT INTO tblFullTime(ppsn, name, salary, months, expenses, taxes, calculatedpay) Values ('HHH5H5', 'vvv', '1500', '12', '0', '11.5', '" + staffs[ 7 ].computePay() + "')" ) ;
            stmt1.executeUpdate( "INSERT INTO tblFullTime(ppsn, name, salary, months, expenses, taxes, calculatedpay) Values ('66H5HH', 'kkk', '3000', '12', '0', '15', '" + staffs[ 8 ].computePay() + "')" ) ;
            stmt1.executeUpdate( "INSERT INTO tblFullTime(ppsn, name, salary, months, expenses, taxes, calculatedpay) Values ('U85649', 'ppp', '8051', '12', '0', '20', '" + staffs[ 9 ].computePay() + "')" ) ;
            
            stmt1.close() ;
            conn1.close() ;
        } catch(SQLException se) {
            System.out.println("SQL Exception:") ;
            while( se != null ) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());
                se = se.getNextException();
            }
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            JOptionPane.showMessageDialog(null, "Record Saved!");                
        }          
    }    
}
    
    
