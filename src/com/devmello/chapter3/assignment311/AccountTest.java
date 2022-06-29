package com.devmello.chapter3.assignment311;

import java.util.Scanner;
/** Ex Assignment #
 * This program tests the Account class
 * @author devmello
 * 6/14/22
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);
        // display initial balance of each object
         System.out.printf("%s balance: $%.2f%n",
            account1.getName(), account1.getBalance());
         System.out.printf("%s balance: $%.2f%n%n",
            account2.getName(), account2.getBalance());
         // create a Scanner to obtain an amount to withdraw from the command window
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter withdrawal amount for account1: "); // prompt
        double withdrawalAmount = input2.nextDouble(); // obtain user input
        System.out.printf("%nwithdrawing %.2f from account1 balance%n%n",
             withdrawalAmount);
        account1.withdraw(withdrawalAmount); // withdraw from account1’s balance
        //do the same thing for account2
        System.out.print("Enter withdrawal amount for account2: "); // prompt
        withdrawalAmount = input2.nextDouble(); // obtain user input
        System.out.printf("%nwithdrawing %.2f from account2 balance%n%n",
                withdrawalAmount);
        account2.withdraw(withdrawalAmount);
        // display balances
        System.out.printf("%s balance: $v v v +%.2f%n",
            account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
            account2.getName(), account2.getBalance());


    }
}
