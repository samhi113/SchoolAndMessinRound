package com.rect;

import javax.swing.*;

public abstract class shape {

    protected Point[] listOfPoints;

    public int numberOfSides(){
        return listOfPoints.length;
    }

    public double getSideLength(int sideLengthNumber){
        if (sideLengthNumber > listOfPoints.length || sideLengthNumber < 0){
            JOptionPane.showMessageDialog(null, "Default side is 1.");
            sideLengthNumber = 0;
        } else if (sideLengthNumber == listOfPoints.length){
            sideLengthNumber = 0;
        }
        return calculateSideLength(sideLengthNumber);
    }

    public double calculateSideLength(int sideLengthNumber){
        double xDiff = listOfPoints[sideLengthNumber + 1].getX() - listOfPoints[sideLengthNumber].getX();
        double yDiff = listOfPoints[sideLengthNumber + 1].getY() - listOfPoints[sideLengthNumber].getY();

        double xDiffSquare = Math.pow(xDiff, 2);
        double yDiffSquare = Math.pow(yDiff, 2);

        double sum = xDiffSquare + yDiffSquare;
        return Math.sqrt(sum);
    }

    protected class Point{
        private double x, y;

        Point(double x, double y){
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }


}
