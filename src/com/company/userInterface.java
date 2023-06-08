package com.company;

import java.util.Scanner;

public class userInterface {
    dice addDice() {
        Scanner input = new Scanner(System.in);
        //what should the dice be called/referred to as?
        System.out.println("What should this dice be called?");
        String identifier = input.nextLine();
        //number of sides
        System.out.println("How many sides would you like the dice to have?");
        int numOfSides = input.nextInt();
        input.nextLine();
        //data on sides
        System.out.println("What would you like on each side? Only one character per side");
        char[] sidesData = new char[numOfSides];
        for (int i = 0; i < numOfSides; i++) {
            sidesData[i] = input.next().charAt(0);
            input.nextLine();
        }
        //is it fair?
        System.out.println("Would you like the dice to be fair?");
        boolean isFair = input.nextBoolean();
        input.nextLine();
        //if it isn't fair what should the probabilities be
        int[] probabilities = new int[numOfSides];
        if (isFair) {
            for (int i = 0; i < numOfSides; i++) {
            probabilities[i] = 100 / numOfSides;
            }
        }
        else if (!isFair) {
            System.out.println("What would you like the probability of each side to be? Please enter positive whole numbers");
            for (int i = 0; i < numOfSides; i++) {
                probabilities[i] = input.nextInt();
                input.nextLine();
            }
        }
        dice Dice01 = new dice(identifier, numOfSides, sidesData, isFair, probabilities);
        return Dice01;
    }

}

