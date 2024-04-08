package com.company;

import java.util.Scanner;

class Employee1 {
	private int id;
	private String name;
	public Employee1() {
		//constructor overloading
		id=1;
		name="Java";
	}
	public Employee1(int id,String name) {
		// Generate Constructor
		this.id=id;
		this.name=name;
	}
	public String printDetails() {return name;}
	public int printId() {return id;}
}
public class Program_34 {
	
	public static void main(String[] args) {
		//Print Employee Details
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Employee Id: ");
		int id= sc.nextInt();
		System.out.print("Enter your full name: ");
		String name= sc.next();
		Employee1 e1 = new Employee1(id,name);
		System.out.println(e1.printId()+" "+e1.printDetails());
		Employee1 e2 = new Employee1();
		System.out.println(e2.printId()+" "+e2.printDetails());
	}

}
