package com.piushvaish;

/**
 * Created by piush on 17/03/2016.
 */
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

/**
 * Write a description of class UserInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInterface implements ActionListener
{
    private static JFrame frame;
    private JTextField  display;
    private JTextField ppsn, name, salary, months, expenses, tax, calculatedPay;
    //private JTextField calculatedPay;
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
    public void setVisible(Boolean visible){
        frame.setVisible(visible);
    }

    public void makeFrame(){
        //Frame with min height and width of 800, 800
        frame = new JFrame(getTitle());
        frame.setSize(800, 800);

        JPanel contentPane = (JPanel)frame.getContentPane();
        //JPanel ButtonPane = (JPanel)frame.getContentPane();

        //Spacing and border widths
        contentPane.setLayout(new BorderLayout(6, 100));
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));

        //display Author
        display = new JTextField(getAuthor());
        display.setEditable(false);
        contentPane.add(display,BorderLayout.NORTH);

        //Calculator Panel
        JPanel calculatorPanel = new JPanel(new GridLayout(7,3));
        JPanel buttonPanel = new JPanel(new GridLayout(1,2));


        // ppsn
        addLabel(calculatorPanel, "PPSN: ");
        ppsn = new JTextField("");
        //ppsn.setInputVerifier(verifier);
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
        //salary.setInputVerifier(verifier);
        calculatorPanel.add(salary);
        addLabel(calculatorPanel, "€");

        // months
        addLabel(calculatorPanel, "Months Worked: ");
        months = new JTextField("");
        //months.setInputVerifier(verifier);
        calculatorPanel.add(months);
        addLabel(calculatorPanel, "Mths");


        // expenses
        addLabel(calculatorPanel, "Expenses: ");
        expenses = new JTextField("");
        calculatorPanel.add(expenses);
        addLabel(calculatorPanel, "€");

        // tax
        addLabel(calculatorPanel, "Tax Rate: ");
        tax = new JTextField("");
        calculatorPanel.add(tax);
        addLabel(calculatorPanel, "%");

        //calculatedPay
        addLabel(calculatorPanel, "Calculated Pay: ");
        calculatedPay = new JTextField("");
        calculatorPanel.add(calculatedPay);
        addLabel(calculatorPanel, "€");


        //--Adding Buttons
        //full time button
        calculateFullTimePay = new JButton("Full Time Pay");
        calculateFullTimePay.addActionListener(this);
        buttonPanel.add(calculateFullTimePay,BorderLayout.WEST);
        /*
        //clear button
        clearScreen = new JButton("Clear Screen");
        clearScreen.addActionListener(this);
        contentPane.add(clearScreen,BorderLayout.PAGE_END);
        */
        //Part Time button
        calculatePartTimePay = new JButton("Part Time Pay");
        calculatePartTimePay.addActionListener(this);
        buttonPanel.add(calculatePartTimePay,BorderLayout.EAST);

        contentPane.add(calculatorPanel,BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    //Sub class of InputVerifier which verifies input on JTextField.
//     InputVerifier verifier = new InputVerifier()
//     {
//         @Override
//         public boolean verify(JComponent input) {
//             String text1 = salary.getText();
//            // String text2 = months.getText();
//             try {
//                 Double.parseDouble(text1);
//                // Double.parseDouble(text2);
//             }
//             catch(NumberFormatException e) {
//                 JOptionPane.showMessageDialog(null, "You must input a number!");
//                 return false;
//             }
//             return true;
//             }
//         };


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
    /***
     * Button Action: Calculate Full Time Pay
     *
     */
    public void calculateFullTimePay() {
        //if(ppsn == null) throw new IllegalArgumenException("ppsn is empty");
        String ppsn = ppsn.getText();
        String name = name.getText();
        double salary = Double.parseDouble(salary.getText());
        double months = Double.parseDouble(months.getText());
        double tax = Double.parseDouble(tax.getText());

        Double pay = partTime.computePay();

        calculatedPay.setText(Double.toString(pay));
        months.setText(Double.toString(12));
        expenses.setText(Double.toString(0));

    }
    public void NewFulltime(String ppsn, String name, double salary, double months, double tax)
    {
        Fulltime F1 = new FullTime(ppsn , name, salary,months,tax);
        display.setText("Your wage is " + name + calculatedPay);
    }

    /***
     * Button Action: Calculate Part Time Pay
     *
     */
    private void calculatePartTimePay() {
        PartTime partTime = new PartTime(ppsn.getText(),name.getText(),Double.parseDouble(salary.getText()),
                Double.parseDouble(months.getText()),Double.parseDouble(expenses.getText()),Double.parseDouble(tax.getText()));

        Double pay = partTime.computePay();

        calculatedPay.setText(Double.toString(pay));
    }


    /***
     * Button Action: Clear Screen
     * ppsNum, name, emailAddress, employeeNum, salary, hireYear, hireMonth, hireDate,months,tax
     * calculatedPay
     */
    private void reDisplay()
    {
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
