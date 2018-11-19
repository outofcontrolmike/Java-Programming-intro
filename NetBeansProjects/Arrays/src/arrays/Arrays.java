/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Michael
 */

import java.util.*;
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int capcom[] = new int[10];
        int array[] = new int[10];

        
        int square[] = {1,2,3,4,5,6,7,8,9,10};
        
        capcom[0] = 10;
        capcom[1] = 20;
        capcom[2] = 40;
        capcom[9] = 100;
        
        System.out.println(capcom[9]);
        System.out.println(square.length);
        System.out.println(array[9]);

        
        array[0] = 1;
        array[9] = 10;
        
        System.out.println(array[9]);
        
        // Exception Handling - Try & Catch
        Scanner input = new Scanner(System.in);
        
        try
        {
            System.out.println("Enter first Number");
        int n1 = input.nextInt();
        System.out.println("Enter 2nd Number");
        int n2 = input.nextInt();
        int sum = n1/n2;
        System.out.println(sum);
    }
        catch(Exception e)
        {
           System.out.println("You cant do that in my program!");
            }
        
        
    }
    
}
