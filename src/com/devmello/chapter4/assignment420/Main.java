package com.devmello.chapter4.assignment420;

import java.util.Scanner;

/** Ex 4.20
 * a Java application that determines the gross pay for each of three employees
 * The company pays straight time for the first 40 hours worked by each employee and time and a half for all hours worked in excess of 40
 * You’re given a list of the employees, their number of hours worked last week and their hourly rates
 * Your program should input this information for each employee, then determine and display the employee’s gross pay
 * Use class Scanner to input the data
 * @author devmello
 * 6/14/22
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hoursWorked = 0;
        double hourlyRate = 0;
        double grossPay = 0;
        int counter = 0;
        while (counter < 3) {
            System.out.println("Enter hours worked: ");
            hoursWorked = input.nextInt();
            System.out.println("Enter hourly rate: ");
            hourlyRate = input.nextDouble();
            if (hoursWorked <= 40) {
                grossPay = hoursWorked * hourlyRate;
            } else {
                grossPay = 40 * hourlyRate + (hoursWorked - 40) * hourlyRate * 1.5;
            }
            counter++;
            System.out.println("Gross pay for Employee "+counter +" is: " + String.format("%.2f", grossPay));
        }
    }
}
