package com.company;

import java.util.Scanner;

public class Program_21 {

	public static void main(String[] args) {
		// Given an integer is available or not in list
		int [] num = {50,45,85,97,65,12};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter searching value: ");
		int x = sc.nextInt();
		boolean flag=false;
		for(int element: num) {
			if(x==element)
			{
				flag=true;
				break;
			}	
		}
		if(flag) {
			System.out.print(x + " is found in the array list.");
		}
		else {
			System.out.print(x + " is not found in the array list.");
		}	
	}	
}
