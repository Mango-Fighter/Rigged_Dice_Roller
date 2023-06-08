package com.company;
import javax.swing.*;
import java.awt.event.*;

public class graphicalUI {
    userInterface theUI = new userInterface();
    public graphicalUI() {
        //create the window
        JFrame f = new JFrame("Lorem Ipsum");
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
        JButton b = new JButton("Dolor Sit Amet");
        b.setBounds(250, 175, 100, 50);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                theUI.addDice();
            }

        });
        //add a button
        f.add(b);
        f.add(tf);
    }
}
