package com.company;

import java.util.Scanner;

public class Program_13 {

	public static void main(String[] args) {
		// Website check
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter URL: ");
		String website= sc.next();
		if(website.endsWith(".org"))
			System.out.print("Organizational website");
		else if(website.endsWith(".com"))
			System.out.print("Commersial website");
		else if(website.endsWith(".in"))
			System.out.print("Indian website");

	}

}
