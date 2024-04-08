package com.company;

import java.util.Scanner;

public class Program_31 {
	
	public static int fibo(int n) {
		if(n==1||n==2)
			return n-1;
		else
			return fibo(n-1)+fibo(n-2);
		
	}
	public static void main(String[] args) {
		// Fibonacci Series using recursive
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of point: ");
		int n = sc.nextInt();
		System.out.printf("The Fibonacci series of this point: "+ fibo(n));
	}

}
