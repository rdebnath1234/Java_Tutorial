package com.company;

import java.util.Scanner;

public class Program_11 {

	public static void main(String[] args) {
		// Calendar
		Scanner sc= new Scanner(System.in);
		int day= sc.nextInt();
		switch (day) {
		case 1 ->System.out.print("Sunday");
		case 2 ->System.out.print("Monday");
		case 3 ->System.out.print("Tuesday");
		case 4 ->System.out.print("Wednesday");
		case 5 ->System.out.print("Thursday");
		case 6 ->System.out.print("Friday");
		case 7 ->System.out.print("Saturday");
		default ->
		throw new IllegalArgumentException("Unexpected value: " + day);
		}

	}

}
