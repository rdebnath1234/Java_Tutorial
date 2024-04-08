package com.company;

public class Program_24 {

	public static void main(String[] args) {
		// Reverse values of an array
		char [] value = {'U','M','B','R','E','L','L','A'};
		int n=Math.floorDiv(value.length, 2);
		int l=value.length;
		for(int i=0; i<n; i++) {
			//Swap a[i] and a[l-1-i]
			char temp = value[i];
			value[i]=value[l-i-1];
			value[l-i-1]=temp;
		}
		for(char element:value)
		{
			System.out.print(element+" ");
		}
	}

}
