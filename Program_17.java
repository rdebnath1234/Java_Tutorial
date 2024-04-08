package com.company;

import java.util.Scanner;

public class Program_17 {

	public static void main(String[] args) {
		//pattern1
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range value: ");
		int n=sc.nextInt();
		for(int i=n;i!=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}

}
