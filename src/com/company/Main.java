package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        dice dice1 = new dice(12, new char[]{'@', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '?'},
                false, new int[]{0, 0, 0, 0, 0, 0, 50, 0, 0, 0, 0, 50}
        );
        dice dice2 = new dice(4, new char[]{'1','2','3','4'},false, new int[] {15,15,15,55});
        Random r = new Random();
        while (true) {
            char x = dice1.roll();
            //int x = r.nextInt(2);
            System.out.println(x);
        }
    }
}
