package com.devmello.chapter6.assignemnet616;

import java.util.Scanner;
/** Ex 6.16
 * a method isMultiple that determines, for a pair of integers, whether the second integer is a multiple of the first.
 * The method should take two integer arguments and return true if the second is a multiple of the first and false otherwise
 * Incorporate this method into an application that inputs a series of pairs of integers (one pair at a time) and determines whether the second value in each pair is a multiple of the first.
 * @author devmello
 * 6/14/22
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first pair of integers(type -1 to exit): ");
        int first = input.nextInt();
        if (first == -1) {
            System.exit(0);
            return;
        }
        int second = input.nextInt();
        while (first != -1) {
            if (isMultiple(first, second)) {
                System.out.println("The second integer is a multiple of the first");
            } else {
                System.out.println("The second integer is not a multiple of the first");
            }
            System.out.print("Enter the first pair of integers(type -1 to exit): ");
            first = input.nextInt();
            if (first != -1) {
                second = input.nextInt();
            } else {
                System.exit(0);
            }
        }
    }
    public static boolean isMultiple(int a, int b) {
        if (b % a == 0) {
            return true;
        } else {
            return false;
        }
    }
}
