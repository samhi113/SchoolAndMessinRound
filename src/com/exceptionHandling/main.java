package com.exceptionHandling;

import java.util.Random;

public class main {

    public static void main(String[] args) {
        Random rand = new Random();
        try{
            int a = rand.nextInt(20);
            int b = rand.nextInt(5);
            int c = a/b;
            int r = a%b;
            System.out.println(a + " / " + b + " = " + c + " remainder " + r);
        }
        catch(Exception e){
            System.out.println("ERROR:\n" + e.getMessage());
        }
    }
}
