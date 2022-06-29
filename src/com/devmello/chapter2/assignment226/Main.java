package com.devmello.chapter2.assignment226;
import java.util.Scanner;
/** Ex 2.26
 * print 1 2 3 4 on 3 different lines using 3 different methods
 * @author devmello
 * 6/13/22
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter two integers:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }
    }
}
