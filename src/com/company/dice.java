package com.company;
import java.util.Random;
public class dice {
    //dice properties
    int numOfSides;
    char[] dataOnSides;
    boolean isFair;
    int[] sideProbabilities;
    Random r = new Random();
    //dice constructor
    dice(int numOfSides, char[] dataOnSides, boolean isFair, int[] sideProbabilities){

        //use arguments to set the values for your properties
        this.numOfSides = numOfSides;
        this.dataOnSides = dataOnSides;
        this.isFair = isFair;
        //if the dice is fair set the probability of each side at 100/number of sides
        if (isFair) {
            int[] probabilities = new int[numOfSides];
            for (int i = 0; i < numOfSides; i++) {
                probabilities[i] = 100/numOfSides;
            }
            this.sideProbabilities = probabilities;

        }
        //if the dice isn't fair manually input the probabilities
        else{this.sideProbabilities = sideProbabilities;}

    }
    char roll() {
        int range = 0;
        for (int i = 0; i < numOfSides; i++) {
            range += sideProbabilities[i];
        }
        int randomNum = r.nextInt(range) + 1;
        for (int i = 0; i < numOfSides; i++) {
            if (randomNum <= sideProbabilities[i]) {
                return dataOnSides[i];
            }
            else if (randomNum > sideProbabilities[i]) {
                randomNum -= sideProbabilities[i];
            }
        }
        return '⁊';
    }
    void rollStats() {
        int[] rolledStats = new int[6];
        int[] rolledNumbers = new int[4];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                int helper = r.nextInt(6) + 1;
                rolledNumbers[i] = helper;
            }
            for (int j = 0; j < 4 - 1; j++) {
                for (int k = 0; k < 4 - j - 1; k++) {
                    if (rolledNumbers[j] > rolledNumbers[j + 1]) {
                        int temp = rolledNumbers[j];
                        rolledNumbers[j] = rolledNumbers[j + 1];
                        rolledNumbers[j + 1] = temp;
                    }
                }
            }
            rolledStats[i] = rolledNumbers[1] + rolledNumbers[2] + rolledNumbers[3];
            System.out.println(rolledStats[i]);
        }
    }
}
