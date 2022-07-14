package com.devmello.chapter8.assignment86;
/** Ex 8.6
 * Test the Savings Account class.
 * @author devmello
 * 7/5/22
 */
public class SavingsAccountTest {
    //test the SavingsAccount class
    public static void main(String[] args) {
        //create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount();
        //set the annualInterestRate to 4.5
        SavingsAccount.modifyInterestRate(4.5);
        //set the savingsBalance to 1000
        savingsAccount.savingsBalance = 1000;
        //calculate the monthly interest
        savingsAccount.calculateMonthlyInterest();
        //print the savingsBalance
        System.out.println("The savingsBalance is: " + savingsAccount.savingsBalance);
    }
}
