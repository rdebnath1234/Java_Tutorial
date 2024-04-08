package com.company;

import java.util.Scanner;

public class Program_01 {

	public static void main(String[] args) {
		//WAP Calculate percantage of a given student in the CBSE Exam. Marks from 5 subjects must be taken as input from the keyboard
		
		double Num1,Num2,Num3,Num4,Num5;
		System.out.println("Enter Total marks of each subject:(e.g. 80,100)");
		Scanner sc = new Scanner (System.in);
		double total= sc.nextDouble();
		System.out.println("Enter 1st Subject marks:");
		Num1=sc.nextDouble();
		System.out.println("Enter 2nd Subject marks:");
		Num2=sc.nextDouble();
		System.out.println("Enter 3rd Subject marks:");
		Num3=sc.nextDouble();
		System.out.println("Enter 4th Subject marks:");
		Num4=sc.nextDouble();
		System.out.println("Enter 5th Subject marks:");
		Num5=sc.nextDouble();
		total=(Num1+Num2+Num3+Num4+Num5)/500*total;
		System.out.println("Percantage of a given student in the CBSE Exam: "+ total);
 
	}

}
