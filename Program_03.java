package com.company;

public class Program_03 {

	public static void main(String[] args) {
		// Encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
		
		char grade='B';
		grade = (char) (grade + 8);
		System.out.println(grade);
		//Decrypting the grade
		grade = (char) (grade-8);
		System.out.println(grade);
	}

}
