package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class graphicalUI extends Frame implements ActionListener{
    userInterface theUI = new userInterface();
    JFrame f;
    JButton b01;
    JButton b02;
    JButton b03;
    JButton b04;
    JButton b05;
    public void actionPerformed (ActionEvent e) {}
    public graphicalUI() {
        //create the window

        //set size of the window (width,height)
        f.setSize(600,400);
        //set behavior when closed
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //layout has already been managed
        f.setLayout(null);
        //make it visible
        f.setVisible(true);
        //make a text field
        final JTextField tf = new JTextField();
        tf.setBounds(250,75,100,50);
        //make a button
        b01 = new JButton("Dolor Sit Amet");
        b01.setBounds(250, 175, 100, 50);
        b01.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                theUI.addDice();
            }

        });
        //add a button
        f.add(b01);
        f.add(tf);
    }
}
