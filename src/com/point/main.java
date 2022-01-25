package com.point;

public class main {
    public static void main(String[] args) {
        point point1 = new point(8.56, 3.28);
        System.out.println(point1);

        point1.setX(12.73);
        point1.flipVertical();
        point1.translate(-4.32, -10.53);
        point1.flipHorizontal();

        System.out.println(point1);
    }
}
