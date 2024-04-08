package com.company;

import java.util.Scanner;

public class Program_07 {

	public static void main(String[] args) {
		//String Example
		// Convert a string to lower case
		String str1= "Johny Walker";
		str1=str1.toLowerCase();
		System.out.println(str1);
		//Convert A space into a underscore
		str1="Low down world";
		str1=str1.replace(" ", "_");
		System.out.println(str1);
		//letter name replaced
		str1="Dear <|name|>, Thanks a  lot!";
		str1=str1.replace("<|name|>", "Riya");
		System.out.println(str1);
		//Find out double space & Triple Space
		System.out.println(str1.indexOf("  "));
		System.out.println(str1.indexOf("   "));
		//format escape sequence letter
		str1="Dear Riya,\n\tYou are beautiful.\n\tThanks!";
		System.out.println(str1);
	}

}
