package com.company;

import java.util.Random;
import java.util.Scanner;

public class Program_14 {

	public static void main(String[] args) {
		// Game : Rock, Paper, Scissor
		Scanner sc = new Scanner(System.in);
		System.out.print("\'Choose your option': \n 1. Rock \n 2. Paper \n 3. Scissors \n");
		int uvalue = sc.nextInt();
		Random rc= new Random();
		int sysvalue = rc.nextInt(3)+1;
		System.out.println("Computer's choice: "+ sysvalue);
		System.out.println("Your's choice: "+ uvalue);
		if(uvalue==sysvalue) {
			System.out.println("Match Draw.");
		}
		else if((uvalue==1 && sysvalue ==3)||(uvalue==2 && sysvalue ==1)||(uvalue==3 && sysvalue ==2)){
			System.out.println("Congratulation, you win!!");
		}
		else {
			System.out.println("Computer win!!");
		}
	}

}
