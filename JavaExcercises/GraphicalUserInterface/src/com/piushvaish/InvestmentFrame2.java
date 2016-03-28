package com.piushvaish;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

/**
 * Created by piush on 28/02/2016.
 */
public class InvestmentFrame2 extends JFrame {
    private static  final double DEFAULT_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;
    private static  final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 100;

    private JLabel rateLabel;
    private  JTextField rateFeild;
    private JButton button;
    private JLabel resultLabel;
    private  double balance;

    public InvestmentFrame2(){
        balance = INITIAL_BALANCE;
        resultLabel = new JLabel("Balance: " + balance);
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
    }

    private void createTextField(){
        rateLabel = new JLabel("Interest Rate: ");
        final int FIELD_WIDTH = 10;
        rateFeild = new JTextField(FIELD_WIDTH);
        rateFeild.setText(" " + DEFAULT_RATE);
    }
    class AddInterestListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            double rate = Double.parseDouble(rateFeild.getText());
            double interest = balance * rate / 100;
            balance = balance + interest;
            resultLabel.setText("Balance: " + balance);
        }
    }

        private void createButton(){
            button = new JButton("Add Interest");
            ActionListener listener = new AddInterestListener();
            button.addActionListener(listener);
             }
        private void createPanel(){
            JPanel panel  = new JPanel();
            panel.add(rateLabel);
            panel.add(rateFeild);
            panel.add(button);
            panel.add(rateLabel);
            add(panel);
        }
  }

