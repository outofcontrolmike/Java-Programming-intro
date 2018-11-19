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
import java.util.Scanner;
import java.util.Date;

public class Ch2Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the Invoice Calculator!!!!");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        
        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "Y";
        while (choice.equalsIgnoreCase("y")) {
            // get the invoice subtotal from the user
            System.out.println("Enter Subtotal!:  ");
            double subtotal = sc.nextDouble();
            
            // get the discount percent
            double discountPercent;
            if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >=100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            
            // calculate the discount amount and total
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;
            
            // display the results
            String message = "Discount Percent: " + discountPercent + "\n"
                           + "Discount amount: "  + discountAmount + "\n"
                           + "Inovoice Total: "    + total + "\n";
            System.out.print(message);
            
            // see if user wants to continue
            System.out.print("Do you wish to continue? (y/n): ");
            choice = sc.next();
            System.out.println();
            
            
            
            
        }}
}
