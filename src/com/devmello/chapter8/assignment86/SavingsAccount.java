package com.devmello.chapter8.assignment86;
/** Ex 8.6
 * Savings Account Class
 * @author devmello
 * 7/5/22
 */
public class SavingsAccount {
    //Use a static variable annualInterestRate to store the annual interest rate for all account holders
    public static double annualInterestRate;
    //Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has on deposit
    double savingsBalance;
    //Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance by annualInterestRate divided by 12—this interest should be added to savings-Balance
    public void calculateMonthlyInterest() {
        savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }
    // Provide a static method modifyInterestRate that sets the annualInterestRate to a new value
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

}
