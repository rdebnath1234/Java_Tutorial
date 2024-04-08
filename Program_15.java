package com.company;

import java.util.Scanner;

public class Program_15 {

	public static void main(String[] args) {
		// Print Odd Numbers
		System.out.print("Enter n numbers: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("The Odd numbers are in range "+ n + ":");
		for(int i=0; i<n ; i++)
		{
				System.out.println(2*i+1);
		}
		
	}

}
