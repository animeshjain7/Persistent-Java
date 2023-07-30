package com.persistent.learning;
import java.util.Scanner;
public class Array {
 private static Scanner input;
	

	public static void main(String[] args) {
		int[] myArray = new int[5];
//		int [][] twoDArray = new int [2][3]; //[2]->how many one d arrrays i want , [3]-> space in each 1d array
		input = new Scanner(System.in);
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = input.nextInt();
		}
//		for(int i = 0; i < myArray.length; i++) {
//			System.out.println("myArray["+ i +"]:"+ myArray[i]);
//		}
		
		for(int elm : myArray) {
			System.out.println(elm);
		}
	}
}
