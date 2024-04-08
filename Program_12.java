package com.company;

import java.util.Scanner;

public class Program_12 {

	public static void main(String[] args) {
		// Leap-year
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter year(check leap-year or not): ");
		int year= sc.nextInt();
		if (year%400==0 || year%4 == 0 && year%100!=0) 
		 System.out.println("Leap-year");
		else
			System.out.println(year +" is not a Leap-year");		

		}
	}