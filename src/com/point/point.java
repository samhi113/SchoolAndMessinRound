package com.point;

import java.text.DecimalFormat;

public class point {
    public DecimalFormat roundTo2 = new DecimalFormat("#,###.##");

    private double x;
    private double y;

    public point (double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceFrom0(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double slopeFrom0(){
        return this.y / this.x;
    }

    public void translate(double moveX, double moveY){
        this.x = this.x + moveX;
        this.y = this.y + moveY;
    }

    public void flipVertical(){
        this.y = this.y * -1;
    }

    public void flipHorizontal(){
        this.x = this.x * -1;
    }

    public String toString(){
        return "X: " + this.x + "\nY: " + this.y + "\nDistance from (0, 0): " + roundTo2.format(distanceFrom0()) + "\nSlope: " + roundTo2.format(slopeFrom0()) + "\n";
    }
}
