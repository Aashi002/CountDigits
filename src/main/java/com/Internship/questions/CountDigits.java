package com.Internship.questions;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int count = 0;
        int tempNumber = Math.abs(number); // Convert negative numbers to positive for counting
        
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }
        
        System.out.println("Number of digits: " + count);
        
        scanner.close();
    }
}
