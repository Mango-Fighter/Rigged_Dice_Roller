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
        //make a text area
        ta = new JTextArea("Testing");
        ta.setBounds(512,96,256,144);
        ta.setOpaque(true);
        //make buttons
        b01 = new JButton("Main Menu");
        b01.setBounds(106, 480, 150,50);
        b01.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenu();
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
        f.setVisible(true);
    }
    public void mainMenu() {
        //remove the buttons so you can't see the old buttons
        f.remove(b01);
        f.remove(b02);
        //updates the frame
        f.update(f.getGraphics());
        //create the buttons
        b01 = new JButton("Create a Dice");
        b01.setBounds(53, 480, 150, 50 );
        b02 = new JButton("Roll a Dice");
        b02.setBounds(309, 480, 150, 50 );
        b03 = new JButton("Custom Roll");
        b03.setBounds(565, 480, 150, 50 );
        b04 = new JButton("Roll D&D Ability Scores");
        b04.setBounds(821, 480, 150, 50 );
        b05 = new JButton("View History");
        b05.setBounds(1077, 480, 150, 50 );
        //add the buttons and update the frame
        f.add(b01);
        f.add(b02);
        f.add(b03);
        f.add(b04);
        f.add(b05);
        f.update(f.getGraphics());
    }
}
