package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    rollStats();
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
    //a method to a new dice
    void addDice() {
        Scanner input = new Scanner(System.in);
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
        dice Dice01 = new dice(numOfSides, sidesData, isFair, probabilities);
    }
}
