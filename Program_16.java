package com.company;

import java.util.Scanner;

public class Program_16 {

	public static void main(String[] args) {
		// Print Reverse number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of range : ");
		int n = sc.nextInt();
		for(int i=n;i!=0;i--)
		{
			System.out.print(i + ",");
		}
	}

}
