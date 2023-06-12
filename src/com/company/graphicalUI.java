package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class graphicalUI {
    //declare variables
    JFrame f = new JFrame("Dice Roller");
    JButton b01;
    JButton b02;
    JButton b03;
    JButton b04;
    JButton b05;
    JTextArea ta;
    JTextField tf;
    //makes the button do things when pressed, in this case remove the text area and replace it with a new one
    public graphicalUI() {
        //set size of the window (width,height)
        f.setSize(1280,720);
        //layout has already been managed
        f.setLayout(null);
        //make it visible
        f.setVisible(true);
        //make a text area
        ta = new JTextArea("Testing");
        ta.setBounds(440,210,100,150);
        ta.setOpaque(true);
        //make buttons
        b01 = new JButton("Main Menu");
        b01.setBounds(340, 360, 100,50);
        b01.setOpaque(true);
        b01.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //add main menu method here once implemented
                f.remove(ta);
                ta = new JTextArea("This is working :)");
                ta.setBounds(440,210,100,150);
                f.add(ta);
            }
        });
        b02 = new JButton("Exit");
        b02.setBounds(540,360, 100, 50);
        b02.setOpaque(true);
        b02.addActionListener(new ActionListener() {
           public void actionPerformed (ActionEvent e){
               System.exit(12);
           }
        });
        //add components
        f.add(b01);
        f.add(b02);
        f.add(ta);
    }
    public void mainMenu() {


    }
}
