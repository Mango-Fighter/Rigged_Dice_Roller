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
    dice(int numOfSides, char[] dataOnSides, boolean isFair, int[] sideProbabilities) {

        //use arguments to set the values for your properties
        this.numOfSides = numOfSides;
        this.dataOnSides = dataOnSides;
        this.isFair = isFair;
        //if the dice is fair set the probability of each side at 100/number of sides
        if (isFair) {
            int[] probabilities = new int[numOfSides];
            for (int i = 0; i < numOfSides; i++) {
                probabilities[i] = 100 / numOfSides;
            }
            this.sideProbabilities = probabilities;

        }
        //if the dice isn't fair manually input the probabilities
        else {
            this.sideProbabilities = sideProbabilities;
        }

    }

    //a method to roll the dice, adds all the probabilities together and then checks each side, if it is greater than the range it subtracts the side from the range and repeats until the right side is found
    char roll() {
        int range = 0;
        //establish range
        for (int i = 0; i < numOfSides; i++) {
            range += sideProbabilities[i];
        }
        //check then subtract or return
        int randomNum = r.nextInt(range) + 1;
        for (int i = 0; i < numOfSides; i++) {
            if (randomNum <= sideProbabilities[i]) {
                return dataOnSides[i];
            } else if (randomNum > sideProbabilities[i]) {
                randomNum -= sideProbabilities[i];
            }
        }
        return '⁊';
    }
}

