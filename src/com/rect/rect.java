package com.rect;

public class rect {

    private String name;
    private double length, width;

    public rect (String name, double length, double width){
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getName(){
        return this.name;
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
