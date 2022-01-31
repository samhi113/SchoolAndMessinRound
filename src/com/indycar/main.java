package com.indycar;

public class main {
    public static void main(String[] args) {
        indycar palou = new indycar("Alex Palou", "Chip Ganassi", 10, "Honda", 24, 3, 1, 1, 0, 2021, 2021, 0);
        indycar dixon = new indycar("Scott Dixon", "Chip Ganassi", 9, "Honda", 41, 51, 27, 6, 1, 2021, 2020, 2008);
        indycar newgarden = new indycar("Josef Newgarden", "Team Penske", 2, "Chevy", 31, 20, 15, 2, 0, 2021, 2019, 0);
        indycar pato = new indycar("Patricio O'Ward", "Arrow McLaren SP" , 5, "Chevy", 22, 2, 4, 0, 0, 2021, 0, 0);
        indycar malukas = new indycar("David Malukas", "Dale Coyne", 18, "Honda", 20, 0, 0, 0, 0, 0, 0, 0);
        System.out.println(pato);
    }
}


