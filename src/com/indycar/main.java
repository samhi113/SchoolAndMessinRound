package com.indycar;

public class main {
    public static void main(String[] args) {
        indycar palou = new indycar("Alex Palou", "Chip Ganassi", 10, "Honda", 24, 3, 1, 1, 0, 2021, 2021, 0);
        indycar alexP = palou;
        indycar dixon = new indycar("Scott Dixon", "Chip Ganassi", 9, "Honda", 41, 51, 27, 6, 1, 2021, 2020, 2008);
        indycar scottD = dixon;
        indycar newgarden = new indycar("Josef Newgarden", "Team Penske", 2, "Chevy", 31, 20, 15, 2, 0, 2021, 2019, 0);
        indycar josef = newgarden;
        indycar pato = new indycar("Patricio O'Ward", "Arrow McLaren SP" , 5, "Chevy", 22, 2, 4, 0, 0, 2021, 0, 0);
        indycar oWard = pato;
        indycar malukas = new indycar("David Malukas", "Dale Coyne", 18, "Honda", 20, 0, 0, 0, 0, 0, 0, 0);
        indycar david = malukas;
        indycar helio = new indycar("Helio Castroneves", "Meyer Shank", 06, "Honda", 46, 31, 50, 0, 4, 2021, 0, 2021);
        indycar castroneves = helio;
        indycar phoenix = new indycar("Romain Grosjean", "Andretti", 28, "Honda", 35, 0, 1, 0, 0, 0, 0, 0);
        indycar romain = phoenix;
        indycar grosjean = phoenix;
        indycar marcus = new indycar("Marcus Ericsson", "Chip Ganassi", 8, "Honda", 32, 2, 0, 0, 0, 2021, 0, 0);
        indycar ericsson = marcus;
        indycar felix = new indycar("Felix Rosenqvist", "Arrow McLaren SP", 7, "Chevy", 31, 1, 1, 0, 0, 2020, 0, 0);
        indycar rosenqvist = felix;
        indycar rinus = new indycar("Rinus Van Kalmthout", "Ed Carpenter", 21, "Chevy", 21, 1, 1, 0, 0, 2021, 0, 0);
        indycar veekay = rinus;
        System.out.println(felix);
    }
}


