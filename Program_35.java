package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
	private int noOfGuesses=1;
	private int m, n;
	public Game() 
	{
		// Genarate random number
		Random rc = new Random();
		m =rc.nextInt(10);
		//System.out.print(m);
	}
	
	public void takeUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		if(m<n) {
			System.out.println("guessing number is large.");
			
		}
		else if(m>n) {
			
			System.out.println("guessing number is small.");
		}
		else {
			System.out.println("-----------------------------");
		}
		isCorrectNumber();
	}
	public boolean isCorrectNumber() {
		do
		{
			
			
			if(m==n) 
			{
				System.out.printf("after %d times number are guessed correct.",noOfGuesses);
				break;
				
			}
			
			noOfGuesses++;
			this.takeUserInput();
		}
		
		while(false);
		
		return false;
	}
}
public class Program_35 {

	public static void main(String[] args) {
		// Guess the number (OOps Concept)

		Game g1= new Game();
		g1.takeUserInput();
		
	}

}
