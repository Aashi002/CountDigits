package com.Internship.questions;

import java.util.Scanner;

	public class ProductInvoice {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input net price and tax rate
	        System.out.print("Enter net price of the product including taxes: ");
	        double netPrice = scanner.nextDouble();
	        System.out.print("Enter tax rate (in percentage): ");
	        double taxRate = scanner.nextDouble();
	        
	        // Calculate gross price before taxes
	        double grossPriceBeforeTax = netPrice / (1 + (taxRate / 100));
	        
	        // Output in table format
	        System.out.println("\nInvoice Details:");
	        System.out.println("+----------------------------------------------------+");
	        System.out.printf("| %-20s | %-10s | %-15s |\n", "Net Price (incl. tax)", "Tax Rate", "Gross Price (before tax)");
	        System.out.println("+----------------------------------------------------+");
	        System.out.printf("| %-20.2f | %-10.2f%% | %-15.2f |\n", netPrice, taxRate, grossPriceBeforeTax);
	        System.out.println("+----------------------------------------------------+");
	        
	        scanner.close();
	    }
	}

	
	
	
	

