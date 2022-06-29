package com.devmello.chapter2.assignment216;
import java.util.Scanner;
/** Ex 2.16
 * print 1 2 3 4 on 3 different lines using 3 different methods
 * @author devmello
 * 6/13/22
 */
public class Main {
    public static void main(String[] args) {
        //This program asks the user for two integers and displays the larger number
        System.out.println("Enter two integers:");
        //this will create a scanner object
        Scanner input = new Scanner(System.in);
        //this will ask the user for the first integer
        int num1 = input.nextInt();
        //this will ask the user for the second integer
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is larger");
        } else if (num1 < num2) {
            System.out.println(num2 + " is larger");
        } else {
            System.out.println("They are equal");
        }
    }
}