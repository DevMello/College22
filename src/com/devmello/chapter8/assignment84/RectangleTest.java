package com.devmello.chapter8.assignment84;
/** Ex 8.4
 * Test the Rectangle class.
 * @author devmello
 * 7/5/22
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println("Area: " + r.getArea());
        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());
        r.setLength(10);
        r.setWidth(20);
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println("Area: " + r.getArea());
        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());
    }
}
