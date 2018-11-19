/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.score.application;

/**
 *
 * @author Michael
 */
import java.util.Scanner;

public class TestScoreApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Display Operational messages
        
        System.out.println("Enter test Scores that range from 0-100.");
        System.out.println("To end the program, enter 999.");
        System.out.println();
        
        // initialize variables and create a scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        Scanner sc = new Scanner(System.in);
        
        // get a series of test scores from the user
        while (testScore <=100) {
            // get user entry
            System.out.print("Enter score: ");
            testScore = sc.nextInt();
            
            // accumulate score count and score total
            if (testScore <=100) {
                scoreCount = scoreCount + 1;
                scoreTotal = scoreTotal + testScore;
            }
        }
        
        // display the score count, score total, and average score
        double averageScore = (double) scoreTotal / scoreCount;
        String message = "\n"
                + "Score count:         " + scoreCount + "\n"
                + "score Total:         " + scoreTotal + "\n"
                + "Average Score:       " + averageScore + "\n";
        System.out.println(message);
    }
    
}
