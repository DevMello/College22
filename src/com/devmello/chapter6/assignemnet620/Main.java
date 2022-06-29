package com.devmello.chapter6.assignemnet620;

import java.util.Scanner;
/** Ex 6.20
 * an application that prompts the user for the radius of a circle and uses a method called circleArea to calculate the area of the circle
 * @author devmello
 * 6/14/22
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = circleArea(radius);
        System.out.println("The area of the circle is " + area);
    }
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
