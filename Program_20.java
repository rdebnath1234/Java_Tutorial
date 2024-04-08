package com.company;

public class Program_20 {

	public static void main(String[] args) {
		// Sum of 5 float numbers
		float [] num = {23.0f,20.0f,45.8f,56.3f,80.2f};
		float sum=0;
		for (float element:num) {
			sum=sum+element;
		}
		System.out.println("Sum of 5 float numbers: " + sum);
	}
}
