package com.company;


abstract class Pen{
	abstract void write();
	abstract void refill();
}
class FountainPen extends Pen{

	@Override
	void write() {
		System.out.println("Write");

	}
	@Override
	void refill() {

		System.out.println("Refill");
	}
	void changeNib() {
		System.out.println("Change Nib");
	}
}
public class Program_38 {

	public static void main(String[] args) {
		// Create Abstract Class and Abstract methods
		FountainPen pen = new FountainPen();
		pen.write();
		pen.changeNib();
	}
}
