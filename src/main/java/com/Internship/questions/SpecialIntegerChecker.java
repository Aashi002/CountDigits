package com.Internship.questions;

import java.util.Scanner;

public class SpecialIntegerChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Check if it's a two-digit special integer
        boolean isSpecial = isTwoDigitSpecialInteger(num);

        // Print the result
        if (isSpecial) {
            System.out.println(num + " is a two-digit special integer.");
        } else {
            System.out.println(num + " is not a two-digit special integer.");
        }

        scanner.close();
    }

    public static boolean isTwoDigitSpecialInteger(int num) {
        if (num < 10 || num > 99) {
            // Not a two-digit integer
            return false;
        }

        int tensDigit = num / 10;
        int onesDigit = num % 10;
        int sum = tensDigit + onesDigit + (tensDigit * onesDigit);

        return sum == num;
    }
}
