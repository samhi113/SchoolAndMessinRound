package com.rect;

public class rect extends quad{

    private String name;
    private double length, width;

    public rect (double x1, double y1, double length, double width){
       super(x1, y1, x1+length, y1, x1, y1+width, x1+length, y1+width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String toString(){
        return "Width: " + this.width + "\nLength: " + this.length + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }

    public double area(){
        return this.width * this.length;
    }

    public double perimeter(){
        return 2 * (this.width + this.length);
    }
}
