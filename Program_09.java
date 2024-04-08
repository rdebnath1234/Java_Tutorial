package com.company;

import java.util.Scanner;

public class Program_09 {

	public static void main(String[] args) {
		// Total marks required 40% and each subject marks required 33% to pass
		byte m1,m2,m3;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks of subject1:");
		m1=sc.nextByte();
		System.out.println("Enter marks of subject2:");
		m2=sc.nextByte();
		System.out.println("Enter marks of subject3:");
		m3=sc.nextByte();
		float avg =(m1+m2+m3)/3.0f;
		if(avg>=40.0 && m1>=33 && m2>=33 && m3>=33) {
			System.out.println("PASS");
		}
		else
			System.out.println("FAIL");

	}

}
