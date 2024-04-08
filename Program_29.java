package com.company;

import java.util.Scanner;

public class Program_29 {
	public static void table(int m,int n) {
		
			for(int i=1;i<=n;i++)
				System.out.printf("%dX%d=%d\n",m,i,m*i);
	}

	public static void main(String[] args) {
		// Multiplication Table
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number and range : ");
		table(sc.nextInt(),sc.nextInt());
	}

}
