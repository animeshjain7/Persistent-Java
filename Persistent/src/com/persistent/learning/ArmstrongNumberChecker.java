package com.persistent.learning;


import java.util.Scanner;

public class ArmstrongNumberChecker {
 private static Scanner input;
 
 public static boolean isArmstrong( int n) {
	 int originalNumber = n;
	 int digits = 0 , rem = 0 ,sum =0;
		while(originalNumber != 0 ) {
			originalNumber /= 10;
			digits++;	
		}
		originalNumber = n ;
		while(originalNumber > 0) {
			rem = originalNumber%10;
			sum = sum + (int)Math.pow(rem, digits);
			originalNumber /= 10;
		}
		if(sum == n) {
			System.out.println( n + " is a Armstrong Number");
			return true;
		}
		System.out.println( n + " is not a  Armstrong Number");
		return false;
 }
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		int n  = input.nextInt();
		isArmstrong(n);
	}
}
