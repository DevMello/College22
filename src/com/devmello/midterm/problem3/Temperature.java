package com.devmello.midterm.problem3;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = 0;
        double[] temperatures = new double[12];
        double average = 0;
        int i;

        System.out.println("Enter the hottest temprature for each of the 12 months");
        for (i = 0; i < 12; i++) {
            System.out.println("Enter the hottest temprature for month " +(i + 1)+": ");
            temperatures[i] = input.nextDouble();
        }
        for (i = 0; i < 12; i++) {
            average += temperatures[i];
        }
        average = average/12;
        System.out.printf("The average temprature is %.2f%n", average);
        int counter = 0;
        for (i = 0; i < 12; i++) {
            if (temperatures[i] > average) {
                counter++;
            }
        }
        double hottest = temperatures[0];
        for (i = 0; i < 12; i++) {
            if (temperatures[i] > hottest) {
                hottest = temperatures[i];
                month = i + 1;
            }
        }
        switch (month) {
            case 1:
                System.out.println("The hottest month is January" + " with a temprature of " + hottest);
                break;
            case 2:
                System.out.println("The hottest month is February" + " with a temprature of " + hottest);
                break;
            case 3:
                System.out.println("The hottest month is March" + " with a temprature of " + hottest);
                break;
            case 4:
                System.out.println("The hottest month is April" + " with a temprature of " + hottest);
                break;
            case 5:
                System.out.println("The hottest month is May" + " with a temprature of " + hottest);
                break;
            case 6:
                System.out.println("The hottest month is June" + " with a temprature of " + hottest);
                break;
            case 7:
                System.out.println("The hottest month is July" + " with a temprature of " + hottest);
                break;
            case 8:
                System.out.println("The hottest month is August" + " with a temprature of " + hottest);
                break;
            case 9:
                System.out.println("The hottest month is September" + " with a temprature of " + hottest);
                break;
            case 10:
                System.out.println("The hottest month is October" + " with a temprature of " + hottest);
                break;
            case 11:
                System.out.println("The hottest month is November" + " with a temprature of " + hottest);
                break;
            case 12:
                System.out.println("The hottest month is December" + " with a temprature of " + hottest);
                break;
        }
        //print the number of months with temprature above the average
        System.out.println("There are " + counter + " months with temprature above the average");

    }
}
