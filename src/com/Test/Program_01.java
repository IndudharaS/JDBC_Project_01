package com.Test;
import java.util.Scanner;

public class Program_01 {
	public static void main(String[] args) {
		//Hello World! Program.
		System.out.println("Hello World!"); 
		//End of Hello World Code.
		
		//Scanner Class.
		Scanner s = new Scanner(System.in);
		
		//Square of a number.
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		System.out.println("Square of "+ n +" is: "+ (n*n));
		
		//To Print n numbers.
		System.out.print("Enter number to print in loop: ");
		n = s.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("The number: "+(i+1));
		}
		s.close();
	}
}
