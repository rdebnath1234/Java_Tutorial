package com.company;

import java.util.Scanner;

public class Program_19 {

	public static void main(String[] args) {
		// factorial number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		long num= sc.nextLong();
		long fact=1;
		for(long i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.printf("%d!=%d",num,fact);
	}

}
