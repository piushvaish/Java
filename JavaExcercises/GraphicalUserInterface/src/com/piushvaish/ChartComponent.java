package com.piushvaish;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by piush on 28/02/2016.
 */
public class ChartComponent extends JComponent{
    private ArrayList<Double> values;
    private double maxValue;

    public ChartComponent(double max){
        values = new ArrayList<Double>();
        maxValue = max;
    }
    public void append(double value){
        values.add(value);
        repaint();

    }
    public void  paintComponent(Graphics g){
        final int GAP = 5;
        final int BAR_HEIGHT = 10;
        int y = GAP;
        for(double value : values){
            int barWidth = (int)(getWidth() * value / maxValue);
            g.fillRect(0,y,barWidth,BAR_HEIGHT);
            y = y + BAR_HEIGHT + GAP;
        }
    }
}
