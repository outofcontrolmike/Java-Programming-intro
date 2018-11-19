/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
* To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.converter;

/**
 *
 * @author Michael
 */

import java.util.Scanner;

public class Validation {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.next();
        sc.nextLine();
        return s;
    }
    
    public static int getInt(Scanner sc1, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt())  {
                i = sc.nextInt();
                isValid = true;
        } else {
              System.out.println("Error! Invalid integer.  Try again");
        }
        sc.nextLine();
        }
    return i;

}

public static int getInt(String prompt, int min, int max) {
    int i = 0;
boolean isValid = false;
while (!isValid)  {
    i = getInt(sc, prompt);
if (i <= min)  {
    System.out.println(
    "Error! Number must be greater than " + min + ".");
}else if (i >= max) {
    System.out.println(
    "Error! Number must be less than " + max + ".");
}else {
    isValid = true;
}

}
return i;
}
}
