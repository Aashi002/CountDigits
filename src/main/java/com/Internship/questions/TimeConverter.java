package com.Internship.questions;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of seconds
        System.out.print("Enter the number of seconds: ");
        long seconds = scanner.nextLong();

        // Convert seconds to days, hours, minutes, and remaining seconds
        long days = seconds / (24 * 3600);
        seconds = seconds % (24 * 3600);
        long hours = seconds / 3600;
        seconds %= 3600;
        long minutes = seconds / 60;
        seconds %= 60;

        // Print the time equivalent
        System.out.println(days + " Day(s) " + hours + " Hour(s) " + minutes + " Minute(s) " + seconds + " Second(s)");

        scanner.close();
    }
}
