package com.company;

import javax.swing.*;
import java.util.Locale;

public class main {
    public static void main(String[] args) {
        rect rect1 = new rect("A", 7.7, 7.7);

        System.out.println(rect1);

        rect1.setWidth(4.2);
        rect1.setLength(6.9);
        rect1.setName("Sam's Epic Rectangle");

        System.out.println("");
        System.out.println(rect1);
    }
}
