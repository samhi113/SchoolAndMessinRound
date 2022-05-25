package com.connectFour;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class connectFourGame {
    static currentPlayer theCurrentPlayer = currentPlayer.x;

    static JFrame frame;
    static JPanel panel;
    static JButton columnButton1, columnButton2, columnButton3, columnButton4, columnButton5, columnButton6, columnButton7;
    static JLabel[][] spotLabels = new JLabel[7][7];
    static spot[][] spots = new spot[7][7];

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

        columnButton1.setBounds(75, 25, 50, 50);

        columnButton1.addActionListener(new columnButton1Listener());
        columnButton2.addActionListener(new columnButton2Listener());
        columnButton3.addActionListener(new columnButton3Listener());
        columnButton4.addActionListener(new columnButton4Listener());
        columnButton5.addActionListener(new columnButton5Listener());
        columnButton6.addActionListener(new columnButton6Listener());
        columnButton7.addActionListener(new columnButton7Listener());

        initializeSpotsAndLabels();

        panel.add(columnButton1);
        panel.add(columnButton2);
        panel.add(columnButton3);
        panel.add(columnButton4);
        panel.add(columnButton5);
        panel.add(columnButton6);
        panel.add(columnButton7);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void initializeSpotsAndLabels(){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                spots[i][j] = spot.empty;
                spotLabels[i][j] = new JLabel("");
                spotLabels[i][j].setLocation((i*50)+50, (j*50)+50);
                panel.add(spotLabels[i][j]);
            }
        }
    }

    public static class columnButton1Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            attemptAndMakeMove(0);
        }
    }

    public static class columnButton2Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            attemptAndMakeMove(1);
        }
    }

    public static class columnButton3Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            attemptAndMakeMove(2);
        }
    }

    public static class columnButton4Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            attemptAndMakeMove(3);
        }
    }

    public static class columnButton5Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            attemptAndMakeMove(4);
        }
    }

    public static class columnButton6Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            attemptAndMakeMove(5);
        }
    }

    public static class columnButton7Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            attemptAndMakeMove(6);
        }
    }

    public static void attemptAndMakeMove(int xLocation){

        if (spots[xLocation][1] != spot.empty) {
            JOptionPane.showMessageDialog(null, "You can't move there!");
        }

        for (int i = 0; i < 6; i++){
             if (spots[xLocation][i] == spot.empty && spots[xLocation][i+1] != spot.empty){
                if (theCurrentPlayer == currentPlayer.x){
                    spots[xLocation][i] = spot.x;
                    spotLabels[xLocation][i].setText("X");
                } else {
                    spots[xLocation][i] = spot.o;
                    spotLabels[xLocation][i].setText("O");
                }
                switchPlayers();
                panel.updateUI();
            } else {
                 if (theCurrentPlayer == currentPlayer.x){
                     spots[xLocation][6] = spot.x;
                     spotLabels[xLocation][6].setText("X");
                 } else {
                     spots[xLocation][6] = spot.o;
                     spotLabels[xLocation][6].setText("O");
                 }
                 switchPlayers();
                 panel.updateUI();
             }
        }
    }

    public static boolean checkWin(spot spotJustPlaced){
        //vertical win
        if ()

        //horizontal win
        //diagonal TL to BR win
        //diagonal TR to BL win
    }

    public static void switchPlayers(){
        if (theCurrentPlayer == currentPlayer.x){
            theCurrentPlayer = currentPlayer.o;
        } else {
            theCurrentPlayer = currentPlayer.x;
        }
    }
}
