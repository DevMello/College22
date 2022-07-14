package com.devmello.chapter8.assignment84;
/** Ex 8.4
 * attributes length and width, each of which defaults to 1.
 * Provide methods that calculate the rectangle’s perimeter and area
 * Provide a getter method for the length and a getter method for the width
 * Provide a setter method for the length and a setter method for the width
 * The set methods should verify that length and width are each floating-point numbers larger than 0.0 and less than 20.
 * @author devmello
 * 6/14/22
 */
public class Rectangle {
    private double length = 1;
    private double width = 1;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getPerimeter() {
        return (length + width) * 2;
    }
    public double getArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        }
    }
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        }
    }
}

