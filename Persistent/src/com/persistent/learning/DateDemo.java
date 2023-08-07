package com.persistent.learning;


import java.text.SimpleDateFormat;
import java.util.Date;
public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss" ); //MM-> Months 
		String a = sdf.format(d);
		System.out.println(a);
		
		
	
}
	} 
	


