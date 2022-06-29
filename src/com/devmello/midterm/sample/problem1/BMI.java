package com.devmello.midterm.sample.problem1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter your height in inches: ");
        double height = input.nextDouble();
        double bmi = calBMI(weight, height);
        System.out.printf("Your BMI is %.2f%n", bmi);
    }
    public static double calBMI(double weight, double height) {
        //Calculate BMI
        return weight * 703 / (height * height);
    }
}
