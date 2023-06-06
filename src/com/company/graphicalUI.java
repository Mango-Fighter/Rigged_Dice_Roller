package com.company;
import javax.swing.*;

public class graphicalUI {
    public graphicalUI() {
        //create the window
        JFrame f = new JFrame("Lorem Ipsum");
        //create the button
        JButton b = new JButton("Dolor Sit Amet");
        //create the label
        JLabel l = new JLabel("Consectetur adipiscing elit");
        l.setBounds(170,100,60,60);
        //x, y, width, height
        b.setBounds(170,170,60,30);
        //set size of the window (width,height)
        f.setSize(400,400);
        //set behavior when closed
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //layout has already been managed
        f.setLayout(null);
        //make it visible
        f.setVisible(true);
        //add a button and a label
        f.add(b);
        f.add(l);
    }
}
