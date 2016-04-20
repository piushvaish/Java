import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.*;  

/**
 * Write a description of class UserInterface here.
 * 
 * @author Us 
 * @version (a version number or a date)
 */
public class UserInterface implements ActionListener {
    private static JFrame frame;
    private JTextField  display;
    private JTextField ppsn, name, salary, months, expenses, tax, calculatedPay;
    private JLabel status;
    private JButton calculateFullTimePay, calculatePartTimePay, clearScreen, readFullTimePay, readPartTimePay;
    // constructor for the frame
    public UserInterface(){
        makeFrame();
        frame.setVisible(true);
    }

    /**
     * Make the frame visible again
     * @param visible
     */
    public void setVisible(Boolean visible){
        frame.setVisible(visible);
    }

    public void makeFrame(){
        //Frame with min height and width of 800, 800
        frame = new JFrame(getTitle());
        frame.setSize(800, 800);

        JPanel contentPane = (JPanel)frame.getContentPane();

        //Spacing and border widths
        contentPane.setLayout(new BorderLayout(6, 100));
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));

        //display Author
        display = new JTextField(getAuthor());
        display.setEditable(false);
        contentPane.add(display,BorderLayout.NORTH);

        //Calculator Panel
        JPanel calculatorPanel = new JPanel(new GridLayout(9,3));
        JPanel buttonPanel1 = new JPanel(new GridLayout(2,2));
        //JPanel buttonPanel2 = new JPanel(new GridLayout(4,1));
        // ppsn
        addLabel(calculatorPanel, "PPSN: ");
        ppsn = new JTextField("");
        calculatorPanel.add(ppsn);
        addLabel(calculatorPanel, "Text");

        // name
        addLabel(calculatorPanel, "Name: ");
        name = new JTextField("");
        calculatorPanel.add(name);
        addLabel(calculatorPanel, "Text");        

        // salary
        addLabel(calculatorPanel, "Monthly Salary: ");
        salary = new JTextField("");
        //salary.addActionListener(this);
        salary.setInputVerifier(verifier1);
        calculatorPanel.add(salary);
        addLabel(calculatorPanel, "€");

        // months
        addLabel(calculatorPanel, "Months Worked: ");
        months = new JTextField("");
        months.setInputVerifier(verifier2);
        calculatorPanel.add(months);
        addLabel(calculatorPanel, "Mths");

        // expenses
        addLabel(calculatorPanel, "Expenses: ");
        expenses = new JTextField("");
        expenses.setInputVerifier(verifier3);
        calculatorPanel.add(expenses);
        addLabel(calculatorPanel, "€");

        // tax
        addLabel(calculatorPanel, "Tax Rate: ");
        tax = new JTextField("");
        tax.setInputVerifier(verifier4);
        calculatorPanel.add(tax);
        addLabel(calculatorPanel, "%");

        //calculatedPay
        addLabel(calculatorPanel, "Calculated Pay: ");  
        calculatedPay = new JTextField("");
        calculatorPanel.add(calculatedPay);
        calculatedPay.setEditable(false);
        addLabel(calculatorPanel, "€");

        //--Adding Buttons
        //full time button
        calculateFullTimePay = new JButton("Full Time Calculate");
        calculateFullTimePay.addActionListener(this);
        buttonPanel1.add(calculateFullTimePay,BorderLayout.WEST);
        //Part Time button
        calculatePartTimePay = new JButton("Part Time Calculate");
        calculatePartTimePay.addActionListener(this);
        buttonPanel1.add(calculatePartTimePay,BorderLayout.EAST);
        
        //full time READ
        readFullTimePay = new JButton("Show Last Full Time Record");
        readFullTimePay.addActionListener(this);
        buttonPanel1.add(readFullTimePay,BorderLayout.WEST);
        //Part Time READ
        readPartTimePay = new JButton("Show Last Part Time Record");
        readPartTimePay.addActionListener(this);
        buttonPanel1.add(readPartTimePay,BorderLayout.EAST);        

        contentPane.add(calculatorPanel,BorderLayout.CENTER);
        contentPane.add(buttonPanel1, BorderLayout.SOUTH);
        
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Sub class of InputVerifier which verifies input on JTextField.
    InputVerifier verifier1 = new InputVerifier(){
    @Override
    public boolean verify(JComponent input) {
            String text = salary.getText();
            try {
                Double.parseDouble(text);
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You must input a number!");
                return false;
            }
                return true;
        }
    };
    InputVerifier verifier2 = new InputVerifier(){
        @Override
        public boolean verify(JComponent input) {
            String text = months.getText();
            try {
                Double.parseDouble(text);
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You must input a number!");
                return false;
            }
                return true;
        }
    };
    InputVerifier verifier3 = new InputVerifier(){
        @Override
        public boolean verify(JComponent input) {
            String text = expenses.getText();
            try {
                Double.parseDouble(text);
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You must input a number!");
                return false;
            }
                return true;
        }
    };
    InputVerifier verifier4 = new InputVerifier(){
        @Override
        public boolean verify(JComponent input) {
            String text = tax.getText();
            try {
                Double.parseDouble(text);
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You must input a number!");
                return false;
            }
                return true;
        }
    };

    /**
     * action listener
     */
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        if(command.equals("Full Time Calculate"))
            calculateFullTimePay();
        if(command.equals("Part Time Calculate"))
            calculatePartTimePay();
        if(command.equals("Show Last Full Time Record"))
            readFullTimePay();
        if(command.equals("Show Last Part Time Record"))
            readPartTimePay();            
        //if(command.equals("Clear Screen"))
        //    reDisplay();
    }


    private void calculateFullTimePay() {
        try { 
            //automatically populates the month as 12 and expenses as 0 . No whatever the user enters.            
            months.setText(Double.toString(12));
            expenses.setText(Double.toString(0));
            
            FullTime fullTime = new FullTime(ppsn.getText(),name.getText(),Double.parseDouble(salary.getText()),
                    Double.parseDouble(months.getText()),Double.parseDouble(tax.getText()));
                    Double pay = fullTime.computePay();
            calculatedPay.setText(Double.toString(pay));

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
                //set the mysql to autoincrement the id so don't need to fetch the last one and adding one to if in order to insert a new case
                stmt1.executeUpdate( "INSERT INTO tblFullTime(ppsn, name, salary, months, expenses, taxes, calculatedpay) Values ('" + ppsn.getText() + "', '" + name.getText() + "', '" + salary.getText() + "', '" + months.getText() + "', '" + expenses.getText() + "', '" + tax.getText() + "', '" + calculatedPay.getText() + "')" ) ;
                
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
            
            // this exception makes sure that their is a number added for salary and tax. If string, when the button clicks it displays You must input a number
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Incomplete form!");
        } catch(ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Invalid Arithmetic operation!");
        } catch(NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Invalid use of a null reference!");
        } catch(RuntimeException e) {
            JOptionPane.showMessageDialog(null, "I need a break.Please turn off the computer and get some exercise!");
        }    
    }

    /**
     * Button Action: Calculate Part Time Pay
     *
     */
    private void calculatePartTimePay() {
        try {
            PartTime partTime = new PartTime(ppsn.getText(),name.getText(),Double.parseDouble(salary.getText()),
                    Double.parseDouble(months.getText()),Double.parseDouble(expenses.getText()),Double.parseDouble(tax.getText()));
    
            Double pay = partTime.computePay();
            calculatedPay.setText(Double.toString(pay));
            
            try {
                Class.forName("com.mysql.jdbc.Driver") ;
                Connection conn2 = DriverManager.getConnection( "jdbc:mysql://localhost:3306/dbPay?user=root&password=1234") ;
                for(SQLWarning warn = conn2.getWarnings(); warn != null; warn = warn.getNextWarning()) {
                    System.out.println( "SQL Warning:" ) ;
                    System.out.println( "State  : " + warn.getSQLState()  ) ;
                    System.out.println( "Message: " + warn.getMessage()   ) ;
                    System.out.println( "Error  : " + warn.getErrorCode() ) ;
                }
                Statement stmt2 = conn2.createStatement() ;
                //set the mysql to autoincrement the id so don't need to fetch the last one and adding one to if in order to insert a new case
                stmt2.executeUpdate( "INSERT INTO tblPartTime(ppsn, name, salary, months, expenses, taxes, calculatedpay) Values ('" + ppsn.getText() + "', '" + name.getText() + "', '" + salary.getText() + "', '" + months.getText() + "', '" + expenses.getText() + "', '" + tax.getText() + "', '" + calculatedPay.getText() + "')" ) ;
                
                stmt2.close() ;
                conn2.close() ;
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
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Incomplete form!");
        } catch(ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Invalid Arithmetic operation!");
        } catch(NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Invalid use of a null reference!");
        } catch(RuntimeException e) {
            JOptionPane.showMessageDialog(null, "I need a break.Please turn off the computer and get some exercise!");
        }
    }

    //READING!!!
    private void readFullTimePay() {    
        Connection conn = null;
        Statement stmt = null;    
        ResultSet rs = null ;            
        
        try {
            Class.forName("com.mysql.jdbc.Driver") ;
            conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/dbPay?user=root&password=1234") ;
            for(SQLWarning warn = conn.getWarnings(); warn != null; warn = warn.getNextWarning()) {
                System.out.println( "SQL Warning:" ) ;
                System.out.println( "State  : " + warn.getSQLState()  ) ;
                System.out.println( "Message: " + warn.getMessage()   ) ;
                System.out.println( "Error  : " + warn.getErrorCode() ) ;
            }
            stmt = conn.createStatement();
            //set the mysql to autoincrement the id so don't need to fetch the last one and adding one to if in order to insert a new case
            rs = stmt.executeQuery("SELECT * FROM tblFullTime ORDER BY id DESC LIMIT 1") ;
            
            while(rs.next()) {
                ppsn.setText(rs.getString(2)); 
                name.setText(rs.getString(3));
                salary.setText(rs.getString(4));
                months.setText(rs.getString(5)); 
                expenses.setText(rs.getString(6));
                tax.setText(rs.getString(7));
                calculatedPay.setText(rs.getString(8));
            }
            rs.close();
            stmt.close();
            conn.close();
            
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
        }
   }
    
    private void readPartTimePay() {    
        try {
            Class.forName("com.mysql.jdbc.Driver") ;
            Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/dbPay?user=root&password=1234") ;
            for(SQLWarning warn = conn.getWarnings(); warn != null; warn = warn.getNextWarning()) {
                System.out.println( "SQL Warning:" ) ;
                System.out.println( "State  : " + warn.getSQLState()  ) ;
                System.out.println( "Message: " + warn.getMessage()   ) ;
                System.out.println( "Error  : " + warn.getErrorCode() ) ;
            }
            Statement stmt4 = conn.createStatement();
            //set the mysql to autoincrement the id so don't need to fetch the last one and adding one to if in order to insert a new case
            ResultSet rs = stmt4.executeQuery("SELECT * FROM tblPartTime ORDER BY id DESC LIMIT 1") ;
            while(rs.next()) {
                ppsn.setText(rs.getString(2)); 
                name.setText(rs.getString(3));
                salary.setText(rs.getString(4));
                months.setText(rs.getString(5)); 
                expenses.setText(rs.getString(6));
                tax.setText(rs.getString(7));
                calculatedPay.setText(rs.getString(8));
            }
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
        }  
    }
    

    /**
     * Button Action: Clear Screen
     * ppsNum, name, emailAddress, employeeNum, salary, hireYear, hireMonth, hireDate,months,tax
     * calculatedPay
     */
    private void reDisplay() {
        ppsn.setText("");
        name.setText("");
        salary.setText("");
        months.setText("");
        tax.setText("");
        calculatedPay.setText("");
    }

    /**
     * add Labels to the panel
     * @return
     */
    private void addLabel(Container panel, String labelText) {
        JLabel label = new JLabel(labelText);
        panel.add(label);
    }

    public String getTitle() {
        return "Pay Calculator";
    }

    public String getAuthor() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        return "Salary Calculator - " + dateFormat.format(date);
    }
}
