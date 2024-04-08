package com.company;

import java.util.Scanner;

public class Program_28 {
	public static int[] fibo(int m,int...n) {
		
		int a=0,b=1;
		n=new int[m];
		for(int i=0;i<m;i++)
		{
			if(i==0)
			{
				n[0]=0;
				continue;
			}
			if(i==1) {
				n[1]=1;
				continue;
			}
			n[i]=a+b;
			a=b;
			b=n[i];
		}
		
		return n;	
	}

	public static void main(String[] args) {
		// Fibonacci series
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int m= sc.nextInt();
		int[]n = fibo(m);
		for(int e:n) {
			System.out.print(e +",");
		}
	}

}
