/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2.practice;

/**
 *
 * @author Michael
 */
public class InvoiceApp {
    
    public static void main(String[] args) {
        
        // set and calculate the numeric values
        double subtotal = 100;          // set subtotal to 100
        double discountPercent = .2;    // set discountPercent .2
        double discountAmount = subtotal * discountPercent;
        double invoiceTotal = subtotal - discountAmount;
        
        // print the data to the console
        
        System.out.println("Welcome to the invoice calculator");
        System.out.println();
        System.out.println("Subtotal:               " + subtotal);
        System.out.println("Discount Percent:       " + discountPercent);
        System.out.println("Discount Amount:        " + discountAmount);
        System.out.println("Total:                  " + invoiceTotal);
        System.out.println();
        
    
    }
}
