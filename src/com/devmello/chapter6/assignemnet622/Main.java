package com.devmello.chapter6.assignemnet622;
import java.util.Scanner;
/** Ex 6.22
 * Implement the following integer methods: Celsius to Fahrenheit, Fahrenheit to Celsius.
 * @author devmello
 * 6/14/22
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What temperature would you like to convert? 1 for Celsius to Fahrenheit, 2 for Fahrenheit to Celsius, -1 to quit");
        int temp = input.nextInt();
        while(temp != -1) {
            if (temp == 1) {
                System.out.println("What is the temperature in Celsius?");
                double celsius = input.nextDouble();
                System.out.println("The temperature in Fahrenheit is " + farhrenheit((int) celsius));
            } else if (temp == 2) {
                System.out.println("What is the temperature in Fahrenheit?");
                double fahrenheit = input.nextDouble();
                System.out.println("The temperature in Celsius is " + celsius((int) fahrenheit));
            } else if (temp == -1) {
                System.exit(0);
            } else {
                System.out.println("Invalid number");
            }
            System.out.println("What temperature would you like to convert? 1 for Celsius to Fahrenheit, 2 for Fahrenheit to Celsius, -1 to quit: ");
            temp = input.nextInt();
        }
    }
    public static int celsius(int fahrenheit) {
        return (int) (5.0 / 9.0 * (fahrenheit - 32));
    }
    public static int farhrenheit(int celsius) {
        return (int) (9.0 / 5.0 * celsius + 32);
    }
}
