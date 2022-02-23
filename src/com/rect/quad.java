package com.rect;

public class quad extends shape{

    public quad(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        listOfPoints = new Point[4];
        listOfPoints[0] = new Point(x1, y1);
        listOfPoints[1] = new Point(x2, y2);
        listOfPoints[2] = new Point(x3, y3);
        listOfPoints[3] = new Point(x4, y4);
    }
}
