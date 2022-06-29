package com.devmello.chapter5.assignment511;

import java.util.Scanner;

/** Ex 5.11
 * an application that finds the smallest of several integers
 * Assume that the first value read specifies the number of values to input from the user
 * @author devmello
 * 6/14/22
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values to input: ");
        int numValues = input.nextInt();
        int[] values = new int[numValues];
        System.out.print("Enter the values: ");
        //read the values
        for (int i = 0; i < numValues; i++) {
            values[i] = input.nextInt();
        }
        int smallest = values[0];
        for (int i = 1; i < numValues; i++) {
            if (values[i] < smallest) {
                smallest = values[i];
            }
        }
        System.out.println("The smallest value is " + smallest);

    }
}
