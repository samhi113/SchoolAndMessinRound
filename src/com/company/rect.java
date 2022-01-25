package com.company;

import java.text.DecimalFormat;

public class rect {

    private String name;
    private double width;
    private double length;

    public DecimalFormat roundTo2 = new DecimalFormat("#,###.##");

    public rect(String name, double width, double length){
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public String getName() {
        return this.name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area(){
        return this.length * this.width;
    }

    public double perimeter() {
        return 2*(this.length + this.width);
    }

    public String toString() {
        return "Rectangle\nName: " + this.name + "\nWidth: " + this.width + "\nLength: " + this.length + "\nArea: " + roundTo2.format(this.area()) + "\nPerimeter: " + roundTo2.format(this.perimeter());
    }
}
