package com.devmello.midterm.problem1;
public class Savings {
    public static void main(String[] args) {
        double balance = 10000;
        double intrest = balance * 0.05;
        double deposit = (int)(Math.random() * (5000 - 3000 + 1)) + 3000;
        int counter = 0;
        int years;
        for (int i = 0; i < 7; i++) {
            //System.out.println("Year " + (i + 1) + ": " + "Deposit: " + deposit + " Balance: " + (balance + intrest + deposit));
            System.out.printf("Year %d: Deposit: %.2f Balance: %.2f%n", (i + 1), deposit, (balance + intrest + deposit));
            System.out.println();
            balance = balance +intrest+deposit;
            intrest = balance * 0.05;
            deposit = (Math.random() * (5000 - 3000 + 1)) + 3000;
            if (balance < 100000) {
                counter++;
            }
        }
        for (years = counter; balance < 100000; years++) {
            balance = balance +intrest+deposit;
            intrest = balance * 0.05;
            deposit = (Math.random() * (5000 - 3000 + 1)) + 3000;
        }
        System.out.print("It took " + (years) + " years to reach $100,000");
    }
}