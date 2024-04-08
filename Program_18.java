package com.company;

import java.util.Scanner;

public class Program_18 {

	public static void main(String[] args) {
		// sum of Even Numbers using while loop
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range value: ");
		int n = sc.nextInt();
		int i=0,sum=0;
		System.out.println("The list of even numbers in range " + n );
		while(i<n)
		{
			System.out.print(2*i + ",");
			sum=sum+2*i;
			i++;
		}	
		System.out.print("\nThe sum of even numbers : "+sum);
	}

}
