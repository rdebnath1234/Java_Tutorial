package com.company;

import java.util.Scanner;

public class Program_41 {

	public static void main(String[] args) {
		int [] marks = new int [3];
		marks[0]=5;
		marks[1]=6;
		marks[2]=50;
		int index;
		boolean flag=true;
		int i=0;
		while(flag && i<5) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of index:");
			index =sc.nextInt();
			try {
				System.out.println("The value of marks[index]-"+marks[index]);
			}
			catch(Exception e){
				System.out.println("Invalid index");
				i++;
				if(i>=5) {
					System.out.println("Error");
					break;
			}

		}
	}
}

}


