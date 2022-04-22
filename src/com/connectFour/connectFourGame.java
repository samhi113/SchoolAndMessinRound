package com.connectFour;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class connectFourGame {
    static String currentPlayer = "x";

    static JFrame frame;
    static JPanel panel;
    static JButton columnButton1, columnButton2, columnButton3, columnButton4, columnButton5, columnButton6, columnButton7;
    static JLabel spotLabel11, spotLabel12, spotLabel13, spotLabel14, spotLabel15, spotLabel16, spotLabel17, spotLabel21, spotLabel22, spotLabel23, spotLabel24, spotLabel25, spotLabel26, spotLabel27, spotLabel31, spotLabel32, spotLabel33, spotLabel34, spotLabel35, spotLabel36, spotLabel37, spotLabel41, spotLabel42, spotLabel43, spotLabel44, spotLabel45, spotLabel46, spotLabel47, spotLabel51, spotLabel52, spotLabel53, spotLabel54, spotLabel55, spotLabel56, spotLabel57, spotLabel61, spotLabel62, spotLabel63, spotLabel64, spotLabel65, spotLabel66, spotLabel67, spotLabel71, spotLabel72, spotLabel73, spotLabel74, spotLabel75, spotLabel76, spotLabel77;

    public static void main(String[] args) {

        new connectFourGame();

    }
    public connectFourGame(){
        frame = new JFrame();
        panel = new JPanel();

        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        columnButton1 = new JButton();
        columnButton2 = new JButton();
        columnButton3 = new JButton();
        columnButton4 = new JButton();
        columnButton5 = new JButton();
        columnButton6 = new JButton();
        columnButton7 = new JButton();

        columnButton1.addActionListener(new columnButton1Listener());




        int[] rowNumbers = new int[7];
        int[] columnNumbers = new int[7];
    }

    public class columnButton1Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (spotLabel11.getText() == ""){
                spotLabel11.setText(currentPlayer);
                switchPlayers();
            } else if (spotLabel21.getText() == ""){
                spotLabel21.setText(currentPlayer);
                switchPlayers();
            } else if (spotLabel31.getText() == ""){
                spotLabel31.setText(currentPlayer);
                switchPlayers();
            } else if (spotLabel41.getText() == ""){
                spotLabel41.setText(currentPlayer);
                switchPlayers();
            } else if (spotLabel51.getText() == ""){
                spotLabel51.setText(currentPlayer);
                switchPlayers();
            } else if (spotLabel61.getText() == ""){
                spotLabel61.setText(currentPlayer);
                switchPlayers();
            } else if (spotLabel71.getText() == ""){
                spotLabel71.setText(currentPlayer);
                switchPlayers();
            } else {
                JOptionPane.showMessageDialog(null, "You can't move there!");
            }
        }
    }

    public void switchPlayers(){
        if (currentPlayer == "x"){
            currentPlayer = "o";
        } else {
            currentPlayer = "x";
        }
    }
}
