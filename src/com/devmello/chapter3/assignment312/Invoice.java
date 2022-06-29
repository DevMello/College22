package com.devmello.chapter3.assignment312;
/** Ex 3.12
 * Defines the Invoice Class
 * @author devmello
 * 6/14/22
 */
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // create a constructor called Invoice that receives four parameters a part number (type String), a part description (type String), a quantity of the item being purchased (type int) and a price per item (double)
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    // create a method called getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0
    public double getInvoiceAmount() {
        if (quantity < 0) {
            quantity = 0;
        }
        if (pricePerItem < 0) {
            pricePerItem = 0.0;
        }
        return quantity * pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }



}
