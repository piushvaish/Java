package com.piushvaish;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

/**
 * Created by piush on 11/03/2016.
 */
public class UserInterface  implements ActionListener{
    private static JFrame frame;
    private JTextField  display;
    private JTextField ppsNum, name, emailAddress, employeeNum, salary, hireYear, hireMonth, hireDate,months,tax;
    private JTextField calculatedPay;
    private JLabel status;
    private JButton calculateFullTimePay,calculatePartTimePay,clearScreen;
// constructor for the frame
    public UserInterface(){
        makeFrame();
        frame.setVisible(true);

    }

    /**
     * Make the frame visible again
     * @param visible
     */
    public void setVisible(boolean visible){
        frame.setVisible(visible);
    }

    public void makeFrame(){
        //Frame with min height and width of 800, 800
        frame = new JFrame(getTitle());
        frame.setSize(800, 600);

        JPanel contentPane = (JPanel)frame.getContentPane();

        //Spacing and border widths
        contentPane.setLayout(new BorderLayout(6, 100));
        contentPane.setBorder(new EmptyBorder( 10, 10, 10, 10));

        //display Author

        display = new JTextField(getAuthor());
        display.setEditable(false);
        contentPane.add(display,BorderLayout.NORTH);

        //Adding Buttons
        //full time button
        calculateFullTimePay = new JButton("Full Time Pay");
        calculateFullTimePay.addActionListener(this);
        contentPane.add(calculateFullTimePay,BorderLayout.EAST);
        //clear button
        clearScreen = new JButton("Clear Screen");
        clearScreen.addActionListener(this);
        contentPane.add(clearScreen,BorderLayout.CENTER);
        //Part Time button
        calculatePartTimePay = new JButton("Part Time Pay");
        calculatePartTimePay.addActionListener(this);
        contentPane.add(calculatePartTimePay,BorderLayout.WEST);

        //Calculator Panel
        JPanel calculatorPanel = new JPanel(new GridLayout(10,2));

        //ppsNum
        addLabel(calculatorPanel, "PPS NUMBER: ");
        ppsNum = new JTextField("");
        calculatorPanel.add(ppsNum);
        //name
        addLabel(calculatorPanel, "Name: ");
        name = new JTextField("");
        calculatorPanel.add(name);
        // emailAddress
        addLabel(calculatorPanel, "Email Address: ");
        emailAddress = new JTextField("");
        calculatorPanel.add(emailAddress);
        // employeeNum
        addLabel(calculatorPanel, "Employee Number: ");
        employeeNum = new JTextField("");
        calculatorPanel.add(employeeNum);
        // salary
        addLabel(calculatorPanel, "Salary: ");
        salary = new JTextField("");
        calculatorPanel.add(salary);
        // hireYear
        addLabel(calculatorPanel, "Year Hired: ");
        hireYear = new JTextField("");
        calculatorPanel.add(hireYear);
        // hireMonth
        addLabel(calculatorPanel, "Month Hired: ");
        hireMonth = new JTextField("");
        calculatorPanel.add(hireMonth);
        // hireDate
        addLabel(calculatorPanel, "Date Hired: ");
        hireDate = new JTextField("");
        calculatorPanel.add(hireDate);
        // months
        addLabel(calculatorPanel, "Months Worked: ");
        months = new JTextField("");
        calculatorPanel.add(months);
        // tax
        addLabel(calculatorPanel, "Tax Rate: ");
        tax = new JTextField("");
        calculatorPanel.add(tax);
        //calculatedPay
        addLabel(calculatorPanel, "Calculated Pay: ");
        calculatedPay = new JTextField("");
        calculatorPanel.add(calculatedPay);

        contentPane.add(calculatorPanel,BorderLayout.CENTER);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
    /**
     * action listener
     */
    public void actionPerformed(ActionEvent event) {


        String command = event.getActionCommand();
        if(command.equals("Full Time Pay"))
            calculateFullTimePay();
        if(command.equals("Part Time Pay"))
            calculatePartTimePay();
        if(command.equals("Clear Screen"))
            reDisplay();

    }
    /**
     * Button Action: Clear Screen
     * ppsNum, name, emailAddress, employeeNum, salary, hireYear, hireMonth, hireDate,months,tax
     * calculatedPay
     */
    private void reDisplay()
    {

        ppsNum.setText("");
        emailAddress.setText("");
        name.setText("");
        employeeNum.setText("");
        salary.setText("");
        hireYear.setText("");
        hireMonth.setText("");
        hireDate.setText("");
        months.setText("");
        tax.setText("");
        calculatedPay.setText("");

    }

    /**
     * add Labels to the panel
     * @return
     */
    private void addLabel(Container panel, String labelText){
        JLabel label = new JLabel(labelText);
        panel.add(label);
    }
    public String getTitle(){
        return "Pay Calculator";
    }
    public String getAuthor(){
        return "Author: Piush,Guillaume - 08/03/2016";
    }

}
