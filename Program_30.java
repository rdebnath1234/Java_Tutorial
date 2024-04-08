package com.company;

import java.util.Scanner;

public class Program_30 {
	public static void pattern(int m) {
		for(int i=1; i<=m;i++)
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("   *");

			}
			System.out.print("\n");
		}
		for(int i=1; i<=m;i++)
		{
			for(int j=m;j>=i;j--) 
			{
				System.out.print("   *");

			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		// Pattern 2
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range: ");
		pattern(sc.nextInt());

	}

}
