package com.piushvaish;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by piush on 28/02/2016.
 */
public class ButtonFrame1 extends JFrame {
    private JButton button;
    private JLabel label;
    private static  final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;
    public ButtonFrame1(){
        createComponents();
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
    }
    class ClickListener implements  ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("I was clicked!");

        }
    }

    public void createComponents(){
        button = new JButton("Click Me!");
        ActionListener listener = new ClickListener();
        button.addActionListener(listener);
        label = new JLabel("Hello! world");
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        add(panel);


    }
}
