package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Program_42 {

	public static void main(String[] args) {
		// ArrayList
		ArrayList ar = new ArrayList();
		ar.add("Student1");
		ar.add("Student2");
		ar.add("Student3");
		ar.add("Student4");
		
		for (Object o : ar)
		{
			System.out.println(o);
		}
		//Date class
		Date d = new Date();
		System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
		//Calendar class
		Calendar c= Calendar.getInstance();
		System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		//java.time package (latest)
		LocalDateTime dt = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
		System.out.println(dt.format(df));
	}
}

