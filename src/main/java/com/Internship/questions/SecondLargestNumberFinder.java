package com.Internship.questions;

import java.util.Arrays;

public class SecondLargestNumberFinder {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 15};
        int secondLargest = findSecondLargest(numbers);
        System.out.println("Second largest number: " + secondLargest);
    }

    public static int findSecondLargest(int[] numbers) {
        if (numbers.length < 2) {
            // Handle arrays with less than two elements
            System.out.println("Array should have at least two elements.");
            return Integer.MIN_VALUE; // Returning minimum integer value as indicator of error
        }

        Arrays.sort(numbers); // Sort the array in ascending order

        // Find the second largest element
        int max = numbers[numbers.length - 1];
        for (int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] < max) {
                return numbers[i];
            }
        }

        return Integer.MIN_VALUE; // Should not reach here, returning minimum integer value as indicator of error
    }
}
