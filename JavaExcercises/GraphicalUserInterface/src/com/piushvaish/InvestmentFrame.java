package com.piushvaish;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by piush on 28/02/2016.
 */
public class InvestmentFrame extends JFrame{
    private JButton button;
    private JLabel resultlabel;
    private double balance;
    private static  final double INTEREST_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;
    private static  final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;

    public InvestmentFrame(){
        balance = INITIAL_BALANCE;
        createComponents();
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
    }
//    class AddInterestListener implements ActionListener{
//        public void actionPerformed(ActionEvent event){
//            double interest = balance * INTEREST_RATE /100;
//            balance = balance + interest;
//            resultlabel.setText("Balance: " + balance);
//        }
//    }
    public void createComponents(){
        button = new JButton("Add Interest!");
        //ActionListener listener = new AddInterestListener();
        // anonymous inner class
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                double interest = balance * INTEREST_RATE /100;
                balance = balance + interest;
                resultlabel.setText("Balance: " + balance);
            }
        });
        //button.addActionListener(listener);
        resultlabel = new JLabel("Balance: " + balance);
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(resultlabel);
        add(panel);


    }

}
