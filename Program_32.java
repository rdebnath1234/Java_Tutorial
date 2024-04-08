package com.company;

import java.util.Scanner;

public class Program_32 {
	public static void pattern(int x) {
		if(x!=0) {
			pattern(x-1);
			for(int i=0;i<x;i++)
				System.out.print(" *");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// Pattern print recursive
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int x = sc.nextInt();
		pattern(x);
	}

}
