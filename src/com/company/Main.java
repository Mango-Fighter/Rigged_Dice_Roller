package com.company;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        graphicalUI GUI = new graphicalUI();

    }
    //a method to roll stats for dnd, rolls four numbers and then sorts them lowest to highest. adds the three highest numbers together to give proper dnd stats
    static void rollStats() {
        Random r = new Random();
        int[] rolledStats = new int[6];
        int[] rolledNumbers = new int[4];
        for (int k = 0; k < 6; k++) {
            for (int i = 0; i < 4; i++) {
                int helper = r.nextInt(6) + 1;
                rolledNumbers[i] = helper;
            }
            for (int i = 0; i < rolledNumbers.length; i++) {
                for (int j = i + 1; j < rolledNumbers.length; j++) {
                    if (rolledNumbers[i] > rolledNumbers[j]) {
                        int temp = rolledNumbers[i];
                        rolledNumbers[i] = rolledNumbers[j];
                        rolledNumbers[j] = temp;
                    }
                }
            }
            rolledStats[k] = rolledNumbers[1] + rolledNumbers[2] + rolledNumbers[3];
            System.out.println("Numbers on dice: " + rolledNumbers[0] + " " + rolledNumbers[1] + " " + rolledNumbers[2] + " " + rolledNumbers[3]);
            System.out.println("Stat: " + rolledStats[k]);
        }
    }
}
