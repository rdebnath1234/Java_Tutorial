package com.company;

//customized class
class Employee{
	int id;
	String name;
	public void printDetails() {
		System.out.println(id +" "+name);
	}
}

public class Program_33 {

	public static void main(String[] args) {
		// OOPs Terminology

		Employee e1 = new Employee();
		e1.id=1;
		e1.name="Riya";
		e1.printDetails();

		Employee e2 = new Employee();
		e2.id=2;
		e2.name="Polo";
		e2.printDetails();
	}

}
