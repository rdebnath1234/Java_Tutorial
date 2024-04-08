package com.company;

import java.util.Scanner;

class Rectangle{
	private float length;
	private float bredth;
	public Rectangle(float length, float bredth) {
		this.length = length;
		this.bredth = bredth;
	}
	
	public float getArea() {
		return length*bredth;
	}
}
public class Program_37 {

	public static void main(String[] args) {
		// Generate Constructor
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and bredth: ");
		Rectangle rc = new Rectangle(sc.nextFloat(), sc.nextFloat());
		System.out.print("Area of rectanle is : "+ rc.getArea()+" sq.unit.");

	}

}
