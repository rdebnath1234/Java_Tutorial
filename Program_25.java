package com.company;

public class Program_25 {

	public static void main(String[] args) {
		// Maximum & Minimum value in array list
		int [] value= { 54,-25,85,58,45,66};
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for(int e:value) {
			if(e>max)
				max=e;
			if(e<min)
				min=e;
		}
		System.out.println("The maximum value in array list: "+ max);
		System.out.println("The minimum value in array list: "+ min);
	}

}
