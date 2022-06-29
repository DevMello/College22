package com.devmello.chapter5.assignment524;

/** Ex Assignment #
 *  an application that prints a diamond shape
 * @author devmello
 * 6/14/22
 */
public class Main {
    public static void main(String[] args) {
        int numRows = 10;
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("**");
            }
            System.out.println();
        }
        for (int i = numRows - 1; i >= 1; i--) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("**");
            }
            System.out.println();
        }
    }
}