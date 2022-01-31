package com.rect;

public class square extends rect {

    public square(String name, double sideLength){
        super(name, sideLength, sideLength);
    }

    public double area() {
        return super.area();
    }

    public double perimeter() {
        return super.perimeter();
    }

    public double getLength() {
        return super.getLength();
    }

    public double getWidth() {
        return super.getWidth();
    }

    public String getName() {
        return this.getName();
    }

    public void setLength(double length) {
        super.setLength(length);
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void setWidth(double width) {
        super.setWidth(width);
    }

    public String toString(){
        return super.getName()
                + "\nSide Length: " + super.getLength()
                + "\nArea: " + super.area()
                + "\nPerimeter: " + super.perimeter();
    }
}
