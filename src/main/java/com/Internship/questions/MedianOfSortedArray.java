package com.Internship.questions;

import java.util.Arrays;

public class MedianOfSortedArray {
    public static void main(String[] args) {
        int[][] arrays = {
            {1, 2, 3, 4, 5},        // Odd number of elements
            {1, 2, 3, 4},           // Even number of elements
            {2, 4, 6, 8, 10, 12},   // Even number of elements
            {3, 6, 9, 12, 15},      // Odd number of elements
            {}                      // Empty array
        };
        
        // Output table header
        System.out.println("+----------------------------------+--------+---------+");
        System.out.println("| Array                            | Middle | Median  |");
        System.out.println("+----------------------------------+--------+---------+");
        
        for (int[] array : arrays) {
            // Calculate median
            double median = findMedian(array);
            
            // Output array details in table format
            System.out.printf("| %-32s |  %-5d |  %-6.1f |\n", Arrays.toString(array), array.length > 0 ? array[array.length / 2] : -1, median);
        }
        
        // Output table footer
        System.out.println("+----------------------------------+--------+---------+");
    }
    
    // Function to find median of sorted array
    public static double findMedian(int[] array) {
        int length = array.length;
        if (length == 0) {
            return -1.0; // Array is empty
        }
        
        if (length % 2 != 0) {
            // Odd number of elements
            return array[length / 2];
        } else {
            // Even number of elements
            int middleIndex = length / 2;
            return (array[middleIndex - 1] + array[middleIndex]) / 2.0;
        }
    }
}
