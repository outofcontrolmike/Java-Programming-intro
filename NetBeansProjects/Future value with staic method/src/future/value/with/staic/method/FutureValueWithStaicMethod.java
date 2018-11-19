/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package future.value.with.staic.method;

/**
 *
 * @author Michael
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class FutureValueWithStaicMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the Future Value App");
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while(choice.equalsIgnoreCase("y")){
            // get input from the user
            System.out.print("Enter monthly investment ");
            double monthlyInvestment = sc.nextDouble();
            System.out.print("Enter yearly intrest rate ");
            double interestRate = sc.nextDouble();
            System.out.print("Enter number of years ");
            int years = sc.nextInt();
            
            // convert yearly values to monthly values
            double monthlyInterestRate = interestRate/12/100;
            int months = years * 12;
            
            // call the futre value method
            double futureValue = calculateFutureValue(
            monthlyInvestment, monthlyInterestRate, months);
            
            // format and display the result
            
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            System.out.println("Future Value:               "
                                + currency.format(futureValue));
            System.out.println();
            
        }
    }
    // Creating a static method that requires three arguments and returns a double
    public static double calculateFutureValue(double monthlyInvestment,
            double monthlyInterestRate, int months) {
        double futureValue = 0.0;
        for (int i = 1; i <= months; i++) {
            futureValue = (futureValue + monthlyInvestment) * (1 +
                    monthlyInterestRate);
            
        }
        return futureValue;
    }
    
}
