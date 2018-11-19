/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Michael
*/
import java.util.Scanner;
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int LIMIT = 10;
        
        System.out.println("Welcome to the guess the number app!");
        System.out.println("I'm thinking of a number from 1 to " + LIMIT);
        System.out.println();
        
        // get a random number between 1 and the limit
        double d = Math.random() * LIMIT;   // creading variable d that won't go over 10
        int number = (int) d;               // converting an double to integer
        number++;                           // increments from 1 to 10
        
        Scanner sc = new Scanner(System.in);  // set scanner in
        int count = 1;                        // set a counter for loop
        while (true) {                        // This tests a condition while it's true
            System.out.print("Your guess:  ");  // 
            int guess = sc.nextInt();
            
            if(guess < 1 || guess > LIMIT) {
                System.out.println("Invalid guess, try again!");
                continue;
            }
            if (guess < number) {
                System.out.println("Too low, try again!");
                
            }else if(guess > number) {
                System.out.println("Too High");
            }else {
                System.out.println("You guess the number in " + 
                        count + " tries.\n");
                
                break;
            }
             count++;   
        }
        System.out.println("bye!");

     
    }    
}
