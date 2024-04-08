package com.company;

interface BasicAnimal{
	void eat();
	void sleep();
}
class Monkey{
	void jump() {
		System.out.println("Jump");
	}
	void bite() {
		System.out.println("Bite");
	}
}


class Human extends Monkey implements BasicAnimal{
	void speak() {
		System.out.println("Speak");
	}

	@Override
	public void eat() {
		System.out.println("Eat");

	}

	@Override
	public void sleep() {
		System.out.println("Sleep");

	}
}
public class Program_39 {
	public static void main(String[] args) {
		//create inheritance a parent class(Monkey) and implements an interface(BasicAnimal)
		Human h1 = new Human();
		h1.eat();
		h1.sleep();
		h1.speak();
		h1.jump();
		h1.bite();
		System.out.println("polimorfism(Monkey Class) reference act as Human Object");
		Monkey m1 = new Human();
		m1.bite();
		m1.jump();
		//m1.speak();--> cannot use speak method as m1 reference have not speak() method
		System.out.println("polimorfism(BasicAnimal interface) reference act as Human Object");
		BasicAnimal ba1 = new Human();
		ba1.eat();
		ba1.sleep();
		//ba1.speak();--> cannot use speak method as ba1 reference have not speak() method

	}
}
