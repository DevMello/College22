package com.devmello.chapter4.assignment417;

import java.util.Scanner;
/** Ex Assignment 4.17
 * a Java application that will input the miles driven and gallons(both as integers) used and output the miles per gallon.
 * Loop the program until the user types -1 to quit
 * The program should calculate and display the miles per gallon obtained for each trip and print the combined miles per gallon obtained for all trips up to this point
 * @author devmello
 * 6/14/22
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double milesDriven = 0;
        double gallonsUsed = 0;
        double totalMilesDriven = 0;
        double totalGallonsUsed = 0;
        double totalMilesPerGallon = 0;
        //ask for miles driven and gallons used
        System.out.println("Enter miles driven (-1 to quit): ");
        milesDriven = input.nextInt();
        while (milesDriven != -1) {
            System.out.println("Enter gallons used: ");
            gallonsUsed = input.nextInt();
            //calculate miles per gallon
            double milesPerGallon = milesDriven / gallonsUsed;
            //print miles per gallon
            System.out.println("MPG: " + String.format("%.2f", milesPerGallon));
            //add miles driven and gallons used to total miles driven and total gallons used
            totalMilesDriven += milesDriven;
            totalGallonsUsed += gallonsUsed;
            //calculate total miles per gallon
            totalMilesPerGallon = totalMilesDriven / totalGallonsUsed;
            //print total miles per gallon
            System.out.println("TMPG: " + String.format("%.2f", totalMilesPerGallon));
            //ask for miles driven
            System.out.println("Enter miles driven (-1 to quit): ");
            milesDriven = input.nextInt();
        }
    }
}
