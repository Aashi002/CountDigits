package com.Internship.questions;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        double tax = calculateIncomeTax(income);
        System.out.println("Income Tax: Rs." + tax);

        scanner.close();
    }

    public static double calculateIncomeTax(double income) {
        double tax = 0;

        if (income <= 250000) {
            // No tax for income up to Rs.2,50,000
            tax = 0;
        } else if (income <= 500000) {
            // 10% of income over Rs.2,50,000
            tax = 0.1 * (income - 250000);
        } else if (income <= 1000000) {
            // 10% of income over Rs.2,50,000 + 20% of income over Rs.5,00,000
            tax = 0.1 * (500000 - 250000) + 0.2 * (income - 500000);
        } else {
            // 10% of income over Rs.2,50,000 + 20% of income over Rs.5,00,000 + 30% of income over Rs.10,00,000
            tax = 0.1 * (500000 - 250000) + 0.2 * (1000000 - 500000) + 0.3 * (income - 1000000);
        }

        return tax;
    }
}

