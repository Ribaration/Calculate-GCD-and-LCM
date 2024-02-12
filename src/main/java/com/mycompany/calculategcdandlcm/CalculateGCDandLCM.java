/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculategcdandlcm;

/**
 *
 * @author Ribaration
 */
import java.util.Scanner; // Import the Scanner class from the java.util package for user input

public class CalculateGCDandLCM {
    
    // Method to calculate the greatest common divisor (GCD) using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate the least common multiple (LCM) using GCD
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
    
    // Define the main method
    public static void main(String[] args) {
          // Create a Scanner object for user input
         Scanner scanner = new Scanner(System.in); 
         
         // Prompt the user to enter the first number
        System.out.println("Enter first number: "); 
        // Read the first number
        int num1 = scanner.nextInt(); 
        
        // Prompt the user to enter the second number
        System.out.println("Enter second number: "); 
        // Read the second number
        int num2 = scanner.nextInt(); 
        // Close the Scanner object to release system resources
        scanner.close(); 

        int gcd = calculateGCD(num1, num2); // Call the calculateGCD method to find GCD
        int lcm = calculateLCM(num1, num2, gcd); // Call the calculateLCM method to find LCM

        System.out.println("GCD: " + gcd); // Print the GCD
        System.out.println("LCM: " + lcm); // Print the LCM
    }

    
    }

