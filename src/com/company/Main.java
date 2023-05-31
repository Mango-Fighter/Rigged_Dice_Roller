package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        dice dice1 = new dice(12, new char[]{'@', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '?'},
                false, new int[]{0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1}
        );
        dice dice2 = new dice(4, new char[]{'1','2','3','4'},false, new int[] {15,15,15,55});
        Random r = new Random();
        int y = 0;
        int z = 0;
        for (int i = 0; i < 100; i++) {
            char x = dice1.roll();
            //int x = r.nextInt(2);
            System.out.println(x);
            if (x == '6') {
                y += 1;
            }
            if (x == '?') {
                z += 1;
            }
        }
        int e = 100-(y+z);
        System.out.println("num of sixes: " + y);
        System.out.println("num of questions: " + z);
        System.out.println("num of errors: " + e);
    }
}
