package com.devmello.chapter2.assignment230;
import java.util.Scanner;
/** Ex 2.26
 * Asks the user for a 5 digit integer and separates the digits 5 separate numbers
 * @author devmello
 * 6/13/22
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a five digit number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int digit1 = num / 10000;
        if(digit1 > 9){
            System.out.println("Error: The number is longer then 5 digits long");
            System.exit(0);
        }
        if(digit1 <= 0){
            System.out.println("Error: The number is smaller then 5 digits long");
            System.exit(0);
        }
        int digit2 = (num % 10000) / 1000;
        int digit3 = (num % 1000) / 100;
        int digit4 = (num % 100) / 10;
        int digit5 = num % 10;
        System.out.println("The digits are: " + digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
    }
}

