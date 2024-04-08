package com.company;

import java.util.Scanner;

class Cylinder{
	
	private float radius;
	private float height;
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
}
public class Program_36 {

	public static void main(String[] args) {
		// Generate Getter & Setter Method
		Cylinder c1 = new Cylinder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of cylinder : ");
		c1.setRadius(sc.nextFloat());
		System.out.println("Enter height of cylinder : ");
		c1.setHeight(sc.nextFloat());
		System.out.println("Volume of Cylinder (v)=" + Math.PI*c1.getRadius()*c1.getRadius()*c1.getHeight());
		System.out.println("Surface Area of Cylinder (A)="+(Math.PI*(2*c1.getRadius()*c1.getHeight()+c1.getRadius()*c1.getRadius())));

	}

}
