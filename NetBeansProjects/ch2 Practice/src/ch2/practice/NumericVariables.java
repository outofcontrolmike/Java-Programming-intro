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
public class NumericVariables {
    // integer Aritmetic
    
    int x = 14;
    int y = 8;
    
    int result1 = x + y;
    int result2 = x - y;
    int reslut3 = x * y;
    int result4 = x / y;
    
    String message1 = "Invalid Data Entry";
    String message2 = "";
    String message3 = null;
    
    String firstName = "Bob";
    String lastName = "Smith";   // Smith
    String name = firstName + " " + lastName;  // name is Bob Smith
    
    // Appending
    firstName = "Bob";
    lastName = "Smith";
    name = firstName + " ";
    name = name + lastName;
    
    double price = 14.95;
    String priceString = "Price: " + price;
    
    
    // Syntax!  import packageName.ClassName;
    import java.util.Scanner;
    import java.util.Date;
    import java.text.NumberFormat;
    
    import java.util.*;
    import java.text.*;
    
    Scanner sc = new Scanner(System.in);
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
 