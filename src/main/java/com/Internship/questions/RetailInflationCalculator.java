package com.Internship.questions;

import java.util.Scanner;

public class RetailInflationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the rate of retail inflation
        System.out.print("Enter the rate of retail inflation (in percentage): ");
        double rateOfInflation = scanner.nextDouble() / 100; // Convert percentage to decimal

        // Accept the number of years
        System.out.print("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();

        // Calculate compounded inflation
        double compoundedInflation = calculateCompoundedInflation(rateOfInflation, numberOfYears);

        // Print the result
        System.out.println("Compounded retail inflation after " + numberOfYears + " years: " + compoundedInflation);

        scanner.close();
    }

    public static double calculateCompoundedInflation(double rateOfInflation, int numberOfYears) {
        // Formula for compound interest: A = P * (1 + r)^n
        double compoundedInflation = Math.pow(1 + rateOfInflation, numberOfYears);
        return compoundedInflation;
    }
}
