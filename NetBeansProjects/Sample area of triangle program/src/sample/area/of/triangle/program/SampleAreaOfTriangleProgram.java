/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.area.of.triangle.program;

/**
 *
 * @author Michael
 */
import java.util.Scanner;
public class SampleAreaOfTriangleProgram {

    /**
     * @param args the command line arguments
     */// create a scanner object, will read user input
static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) // runs the main program
    {
        // declare variables to hold base and height
        double height;
        double base;
        
        // User entry
        System.out.print("Enter the triangle's base: ");
        base = sc.nextDouble(); // this will capture user entry in double variable
        //Height
        System.out.print("Enter height: ");// user entry for height
        height = sc.nextDouble(); // captures the user entry in double height
        // both variables are filled
        
        // creating a new variable that divides obtains a nubmer by diving two nubmer entries
        double preArea = base * height;
        // Now divide by 2
        // new variable that takes already created info and divides by 2
        double Area = preArea / 2;
        // Area has been calculated!
        System.out.println("The area of your triangle is : " + Area);
        
        
    }
}
