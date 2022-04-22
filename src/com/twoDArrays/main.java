package com.twoDArrays;

import javax.swing.*;
import java.util.Random;

public class main {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] arrayTwoD = new int[10][20];

        for (int i = 0; i < 10; i++) {
            for (int m = 0; m < 20; m++) {
                arrayTwoD[i-1][m-1] = random.nextInt(40) - 19;
            }
        }

        System.out.println("Finished assigning array values.");

        int wantedX = Integer.parseInt(JOptionPane.showInputDialog("Insert x value"))-1;
        int wantedY = Integer.parseInt(JOptionPane.showInputDialog("Insert y value"))-1;

        JOptionPane.showMessageDialog(null, "The value at (" + wantedX + ", " + wantedY + ") is " + arrayTwoD[wantedX][wantedY]);
    }

}
