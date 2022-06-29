package com.devmello.chapter3.assignment312;

import java.util.Scanner;

/** Ex 3.12
 * Tests the Invoice class
 * @author devmello
 * 6/14/22
 */
public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Amazon Gift Cards", "Amazon gift cards with a prepaid value of 10$", 100, 10.00);
        Invoice invoice2 = new Invoice("Microsoft Gift Cards", "Microsoft gift cards with a prepaid value of 10$", -4, -10.00);
        // print the invoice amount for each invoice
        System.out.printf("%s Total balance: $%.2f%n",
            invoice1.getPartNumber(), invoice1.getInvoiceAmount());
        System.out.printf("%s Total balance: $%.2f%n%n",
            invoice2.getPartNumber(), invoice2.getInvoiceAmount());
        // set the part number, part description, quantity and price per item for each invoice
        // ask the user to enter the part number, part description, quantity and price per item for each invoice
        System.out.println("Enter the part number, part description, quantity and price per item for each invoice:");
        //create a scanner object
        Scanner scanner = new Scanner(System.in);
        //ask the user to enter the part number
        System.out.print("Part : ");
        String partNumber = scanner.nextLine();
        //ask the user to enter the part description
        System.out.print("Part description: ");
        String partDescription = scanner.nextLine();
        //ask the user to enter the quantity
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        //ask the user to enter the price per item
        System.out.print("Price per item: ");
        double pricePerItem = scanner.nextDouble();
        //create a new invoice object
        Invoice invoice3 = new Invoice(partNumber, partDescription, quantity, pricePerItem);
        //print the part number, part description, quantity and price per item for the new invoice
        System.out.printf("Part: %s Description: %s Quantity: %d Price Per Item: %.2f%n%n",
            invoice3.getPartNumber(), invoice3.getPartDescription(),
            invoice3.getQuantity(), invoice3.getPricePerItem());
    }
}