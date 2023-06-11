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
    JTextArea ta;
    JTextField tf;
    //makes the button do things when pressed, in this case remove the text area and replace it with a new one
    public void actionPerformed (ActionEvent e) {
        f.remove(ta);
        ta = new JTextArea("This is a test");
        ta.setBounds(250,25,100,150);
        f.add(ta);
    }
    public graphicalUI() {
        //create the window
        f = new JFrame("Lorem Ipsum");
        //set size of the window (width,height)
        f.setSize(1280,720);
        //layout has already been managed
        f.setLayout(null);
        //make it visible
        f.setVisible(true);
        //make a text field
        ta = new JTextArea();
        ta.setBounds(250,25,100,150);
        //make a button
        b01 = new JButton("Dolor Sit Amet");
        b01.setBounds(250,175, 100, 50);
        b01.addActionListener(this);
        //add a button
        f.add(b01);
        f.add(tf);
    }
}
