package com.company;

import java.util.Scanner;

public class Program_05 {

	public static void main(String[] args) {
		// Expression: (v*v-u*u)/2*a*s
		double v,u,a,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of v:");
		v=sc.nextDouble();
		System.out.println("Enter value of u:");
		u=sc.nextDouble();
		System.out.println("Enter value of a:");
		a=sc.nextDouble();
		System.out.println("Enter value of s:");
		s=sc.nextDouble();
		double e= (v*v-u*u)/2*a*s;
		System.out.println("The result of expression is: "+ e);
	}

}
