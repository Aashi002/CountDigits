package com.Internship.questions;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        
        // Find the larger number
        double largerNumber = (number1 > number2) ? number1 : number2;
        
        // Output the larger number
        System.out.println("The larger number is: " + largerNumber);
        
        scanner.close();
    }
}
