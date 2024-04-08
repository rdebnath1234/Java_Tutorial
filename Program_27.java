package com. company;

import java.util.Scanner;

public class Program_27 {
	public static long factorial(long n) {
		if(n>0)
		{
	      return n*factorial(n-1);
		}
		else 
		{
			return 1;
		}
	}
	public static void main(String[] args) {
	//factorial using recursive method	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value: ");
	long n = sc.nextLong();
	System.out.printf("%d!=%d",n,factorial(n));
	}

}
