package com.company;

public class Program_26 {

	public static void main(String[] args) {
		// Sorted array
		int [] arr = {4,5,6,7,8};
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++) 
		{
			if(arr[i]>arr[i+1]) 
			{
				flag=false;
				break;
			}
		}
		if(flag) 
		{
		System.out.print("This is a sorted array");
		}
		else {
		System.out.print("This is not sorted array");
		}
	}

}
